
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

object listStudent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Student],Form[StudentForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(students: Seq[Student], form: Form[StudentForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.112*/("""

  """),_display_(/*3.4*/main("Students")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

    """),format.raw/*5.5*/("""<h1>Students</h1>

    """),format.raw/*7.40*/("""
    """),_display_(/*8.6*/request/*8.13*/.flash.data.map/*8.28*/{ case (name, media) =>_display_(Seq[Any](format.raw/*8.51*/("""
      """),format.raw/*9.7*/("""<div>"""),_display_(/*9.13*/name),format.raw/*9.17*/(""":     """),_display_(/*9.24*/media),format.raw/*9.29*/("""</div>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""<table>
      <thead>
        <tr><th>Name</th><th>Media</th>
      </thead>
      <tbody>
      """),_display_(/*17.8*/for(w <- students) yield /*17.26*/ {_display_(Seq[Any](format.raw/*17.28*/("""
        """),format.raw/*18.9*/("""<tr><td>"""),_display_(/*18.18*/w/*18.19*/.name),format.raw/*18.24*/("""</td><td>"""),_display_(/*18.34*/w/*18.35*/.media),format.raw/*18.41*/("""</td></tr>
      """)))}),format.raw/*19.8*/("""
      """),format.raw/*20.7*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*25.66*/("""
    """),_display_(/*26.6*/if(form.hasGlobalErrors)/*26.30*/ {_display_(Seq[Any](format.raw/*26.32*/("""
      """),_display_(/*27.8*/form/*27.12*/.globalErrors.map/*27.29*/ { error: FormError =>_display_(Seq[Any](format.raw/*27.51*/("""
        """),format.raw/*28.9*/("""<div>
          """),_display_(/*29.12*/error/*29.17*/.key),format.raw/*29.21*/(""": """),_display_(/*29.24*/error/*29.29*/.message),format.raw/*29.37*/("""
        """),format.raw/*30.9*/("""</div>
      """)))}),format.raw/*31.8*/("""
    """)))}),format.raw/*32.6*/("""

    """),_display_(/*34.6*/helper/*34.12*/.form(postUrl)/*34.26*/ {_display_(Seq[Any](format.raw/*34.28*/("""
      """),_display_(/*35.8*/helper/*35.14*/.CSRF.formField),format.raw/*35.29*/("""

      """),_display_(/*37.8*/helper/*37.14*/.inputText(form("name"))),format.raw/*37.38*/("""

      """),_display_(/*39.8*/helper/*39.14*/.inputText(form("media"))),format.raw/*39.39*/("""

      """),format.raw/*41.7*/("""<button>Add a student along with their media</button>
    """)))}),format.raw/*42.6*/("""
  """)))}),format.raw/*43.4*/("""
"""))
      }
    }
  }

  def render(students:Seq[Student],form:Form[StudentForm.Data],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(students,form,postUrl)(request)

  def f:((Seq[Student],Form[StudentForm.Data],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (students,form,postUrl) => (request) => apply(students,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/listStudent.scala.html
                  HASH: a8221ce7a918e70020c829b8a12860e52fa52a5f
                  MATRIX: 791->1|997->111|1029->118|1053->134|1092->136|1126->144|1178->204|1210->211|1225->218|1248->233|1308->256|1342->264|1374->270|1398->274|1431->281|1456->286|1499->299|1534->307|1663->410|1697->428|1737->430|1774->440|1810->449|1820->450|1846->455|1883->465|1893->466|1920->472|1969->491|2004->499|2075->603|2108->610|2141->634|2181->636|2216->645|2229->649|2255->666|2315->688|2352->698|2397->716|2411->721|2436->725|2466->728|2480->733|2509->741|2546->751|2591->766|2628->773|2663->782|2678->788|2701->802|2741->804|2776->813|2791->819|2827->834|2864->845|2879->851|2924->875|2961->886|2976->892|3022->917|3059->927|3149->987|3184->992
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|32->7|33->8|33->8|33->8|33->8|34->9|34->9|34->9|34->9|34->9|35->10|37->12|42->17|42->17|42->17|43->18|43->18|43->18|43->18|43->18|43->18|43->18|44->19|45->20|50->25|51->26|51->26|51->26|52->27|52->27|52->27|52->27|53->28|54->29|54->29|54->29|54->29|54->29|54->29|55->30|56->31|57->32|59->34|59->34|59->34|59->34|60->35|60->35|60->35|62->37|62->37|62->37|64->39|64->39|64->39|66->41|67->42|68->43
                  -- GENERATED --
              */
          