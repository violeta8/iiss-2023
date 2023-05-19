package controllers 

import javax.inject._
import play.api.mvc._
import play.api.i18n.Langs
import play.api.i18n.MessagesApi
import play.api.mvc._
import javax.inject.Inject
import play.api.http.FileMimeTypes

@Singleton
class AlternativeMessagesControllerComponents @Inject() (val messagesControllerComponents: MessagesControllerComponents) {
  def customMethod() :Unit = {
    println("Custom method")
  }
  
}