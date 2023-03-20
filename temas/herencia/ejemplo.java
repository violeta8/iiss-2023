public class ejemplo {
    public static void main(String[] args) {
        Animal miAnimal = new Animal("Mimi", 2);
        Perro miPerro = new Perro("Fido", 3, "Labrador");
        
        miAnimal.hacerSonido();
        miPerro.hacerSonido();
        miPerro.ladrar();
    }
}
