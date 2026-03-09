
public class Persona {

    private final String nombre;
    private final int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void presentarse() {
        System.out.printf("Hola, me llamo %s y tengo %d años.%n", nombre, edad);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String clasificarEdad() {
        if (edad < 12) {
            return "Niño";
        } else if (edad < 18) {
            return "Adolescente";
        } else {
            return "Adulto";
        }
    }

    public boolean datosValidos() {
        return nombre != null && nombre.length() >= 3 && edad > 0 && edad <= 120;
    }

    public void mostrarResumen() {
        if (!datosValidos()) {
            System.out.println("Datos inválidos -> nombre=" + nombre + ", edad=" + edad);
            return;
        }
        presentarse();
        System.out.println("Tipo: " + clasificarEdad());
    }
}
