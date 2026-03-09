
public class persona3 {

    String nombre;
    int edad;

    boolean validarDatos() {
        return nombre != null
                && nombre.length() > 0
                && edad <= 100;
    }

    boolean esMayorDeEdad() {
        return edad >= 18;
    }

    void mostraResumen() {
        if (!validarDatos()) {
            System.out.println("Datos inválidos");
            return;
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        if (esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
