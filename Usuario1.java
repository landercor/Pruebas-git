
public class Usuario1 {

    String nombre;
    int edad;
    boolean esActivo;

    public Usuario1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.esActivo = true;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Activo: " + esActivo);
    }

}
