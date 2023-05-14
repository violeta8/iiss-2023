package controllers

import javax.inject.Inject

import models.Student
import play.api.data._
import play.api.i18n._
import play.api.mvc._

import scala.collection._

class StudentController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {
  import StudentForm._

  private val students = mutable.ArrayBuffer(
    Student("Mario", 6),
    Student("Maria", 7),
    Student("Mariah", 9)
  )

  private val postUrl = routes.StudentController.createStudent

  def index = Action {
    Ok(views.html.index())
  }

  def listStudent = Action { implicit request: MessagesRequest[AnyContent] =>
    // Pass an unpopulated form to the template
    Ok(views.html.listStudent(students.toSeq, form, postUrl))
  }

  // This will be the action that handles our form post
  def createStudent = Action { implicit request: MessagesRequest[AnyContent] =>
    val errorFunction = { formWithErrors: Form[Data] =>
      BadRequest(views.html.listStudent(students.toSeq, formWithErrors, postUrl))
    }

    val successFunction = { data: Data =>
      // This is the good case, where the form was successfully parsed as a Data object.
      val student = Student(name = data.name, media = data.media)
      students += student
      Redirect(routes.StudentController.listStudent).flashing("info" -> "Student added succesfully!")
    }

    val formValidationResult = form.bindFromRequest()
    formValidationResult.fold(errorFunction, successFunction)
  }
}
