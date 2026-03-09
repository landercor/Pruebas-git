
public class saludar {

    String nombre;
    int edad;

    saludar(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        Hola();
    }

    void Hola() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad);
    }

    public static void main(String[] args) {
        new saludar("Juan", 25);
    }
}
