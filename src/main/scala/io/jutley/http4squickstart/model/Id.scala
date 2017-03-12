package io.jutley.http4squickstart.model

import java.util.UUID

case class ArtistId(value: UUID = UUID.randomUUID()) extends AnyVal
case class AlbumId(value: UUID = UUID.randomUUID()) extends AnyVal
case class SongId(value: UUID = UUID.randomUUID()) extends AnyVal
