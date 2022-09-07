
static void Main(string[] args)
    {
        Persona alumno = new Persona();
        alumno.Nombre = "Roger";
        alumno.FechaNacimiento =Convert.ToDateTime("10/10/1996");
        alumno.registrar();
            Console.WriteLine("la edad del alumno "+alumno.Nombre+" es "+alumno.Edad);
            //el valor de la edad se puede obtener por que la propiedad GET es Publico.        
        Console.ReadKey();
    }