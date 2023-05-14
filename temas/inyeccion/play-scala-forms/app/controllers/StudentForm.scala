package controllers

object StudentForm {
  import play.api.data.Forms._
  import play.api.data.Form


  case class Data(name: String, media: Int)

  val form = Form(
    mapping(
      "name" -> nonEmptyText,
      "media" -> number(min = 0)
    )(Data.apply)(Data.unapply)
  )
}
