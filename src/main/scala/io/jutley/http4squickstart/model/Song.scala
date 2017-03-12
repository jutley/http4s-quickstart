package io.jutley.http4squickstart.model

import scala.concurrent.duration.Duration

case class Song(id: SongId, name: String, artistId: ArtistId, albumId: AlbumId, length: Duration)
