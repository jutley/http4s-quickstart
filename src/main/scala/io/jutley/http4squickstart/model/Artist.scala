package io.jutley.http4squickstart.model

case class Artist(id: ArtistId, name: String, albumIds: Seq[AlbumId])
