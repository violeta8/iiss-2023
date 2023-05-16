
import play.api.i18n.Langs
import play.api.i18n.MessagesApi
import play.api.mvc._
import javax.inject.Inject
import play.api.http.FileMimeTypes


class AlternativeMessagesControllerComponents @Inject()(
  messagesActionBuilder: MessagesActionBuilder,
  actionBuilder: DefaultActionBuilder,
  parsers: PlayBodyParsers,
  langs: Langs,
  fileMimeTypes: FileMimeTypes,
  executionContext: scala.concurrent.ExecutionContext,
  messagesApi: MessagesApi
) extends MessagesControllerComponents {
  // Implementación alternativa
  def customMethod(): String = {
    "Custom method called"
  }

  lazy val _messagesApi: MessagesApi = this.messagesApi
  lazy val _langs: Langs = this.langs
  lazy val _fileMimeTypes: FileMimeTypes = this.fileMimeTypes
  lazy val _executionContext: scala.concurrent.ExecutionContext = this.executionContext

}
