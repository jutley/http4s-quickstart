package io.jutley.http4squickstart.model

case class Album(id: AlbumId, name: String, artistId: ArtistId, songIds: Seq[SongId])