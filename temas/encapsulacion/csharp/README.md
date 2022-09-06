#

## Codigo
    public class Persona
    {
        //Atributos
        private string _nombre;
        private DateTime _fechaNacimiento;
        private int _edad;

        //Propiedades
        public int Edad
        {
            get //Encapsulación nivel abierto, por defecto es publico porque la propiedad es publico.
            {
                return _edad;
            }

            private set //Encapsulación nivel cerrado- Privado
            {
                _edad = value;
            }
        }

        public string Nombre
        {
            get
            {
                return _nombre;
            }

            set
            {
                _nombre = value;
            }
        }

        public DateTime FechaNacimiento
        {
            get
            {
                return _fechaNacimiento;
            }

            set
            {
                _fechaNacimiento = value;
            }
        }

        //Métodos
        public void registrar()
        {
            calcularEdad(FechaNacimiento);
            Console.WriteLine(Nombre+ " ha sido registrado correctamente");
        }

        private void calcularEdad(DateTime fechaNacimientoPersona)
        {
            DateTime fechaActual = DateTime.Now;
            Edad= fechaActual.Year - fechaNacimientoPersona.Year;
        }

    }

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