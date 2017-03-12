package io.jutley.http4squickstart

import io.circe.Decoder
import org.http4s._
import org.http4s.dsl._
import io.circe.generic.extras.auto._
import io.circe.syntax._
import io.jutley.http4squickstart.model.{AlbumId, Artist, ArtistId}
import org.http4s.circe._
import io.circe.literal._

object HelloWorld {

  import json.codecs.circe._

  val service = HttpService {
    case GET -> Root / "artist" =>
      Ok(Seq(Artist(ArtistId(), "Jake Utley", Seq(AlbumId()))).asJson)
    case GET -> Root / "artist" / id =>
      id.asJson.as[ArtistId] match {
        case Right(x) => Ok(x.asJson)
        case Left(_) => BadRequest(json"""{"error":"Invalid id format"}""")
      }
    case request @ POST -> Root / "artist" ~ json =>
      Ok(request.as(jsonOf[Artist]).map(_.asJson))
  }
}
