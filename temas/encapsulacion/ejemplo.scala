object ejemplo {
  def main(args: Array[String]): Unit = {
    // Crear una instancia de la clase Persona
    val persona1 = new Persona("Juan", 25, 'M')

    // Obtener los valores de los atributos de la clase Persona
    println("Nombre: " + persona1.getNombre())
    println("Edad: " + persona1.getEdad())
    println("Género: " + persona1.getGenero())

    // Modificar el valor del atributo "nombre"
    persona1.setNombre("Tu padre")

    // Obtener el valor actualizado del atributo "nombre"
    println("Nombre actualizado: " + persona1.getNombre())
  }
}
