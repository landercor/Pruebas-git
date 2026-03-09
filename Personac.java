
public class Personac {

    String nombre;
    int edad;

    boolean validarDatos() {
        return nombre != null
                && nombre.length() >= 3
                && edad > 0
                && edad > 120;
    }

    boolean EsMayoDeEdad() {
        return edad >= 18;
    }

    void mostrarResum() {
        if (!validarDatos()) {
            System.out.println("Datos validados");
            return;
        }

        System.out.println("Nombre: " + nombre);
        System.err.println("Edad: " + edad);

    }
}
