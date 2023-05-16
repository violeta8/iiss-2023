
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

  """),_display_(/*3.4*/main("Welcome to Play")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
    """),format.raw/*4.5*/("""<div>
      <ul>
        <li>Please go to <a href=""""),_display_(/*6.36*/routes/*6.42*/.StudentController.listStudent),format.raw/*6.72*/("""">"""),_display_(/*6.75*/routes/*6.81*/.StudentController.listStudent),format.raw/*6.111*/("""</a></li>
      </ul>
    </div>
  """)))}),format.raw/*9.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 3b7a355fa7e4c15eeb28c608620a338a18d98c33
                  MATRIX: 722->1|818->3|850->10|881->33|920->35|952->41|1032->95|1046->101|1096->131|1125->134|1139->140|1190->170|1258->209
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|31->6|31->6|31->6|31->6|31->6|31->6|34->9
                  -- GENERATED --
              */
          