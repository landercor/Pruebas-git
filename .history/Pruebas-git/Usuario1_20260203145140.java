
public class Usuario1 {

    String nombre;
    int edad;

    public Usuario1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }

}
