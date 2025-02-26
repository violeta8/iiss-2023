package controllers

import javax.inject._

import play.api.mvc._


@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("Bienvenido!"))
  }

}
