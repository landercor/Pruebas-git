
public class personas {

    String nombre;
    int edad;

    public void esMayor() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else if (edad < 18) {
            System.out.println(nombre + " es menor de edad.");
        } else {
            System.out.println(nombre + " es un viejo.");
        }
    }

    boolean datosValidados() {
        return (edad >= 0 && edad <= 120 && nombre.length() >= 3);
    }

    public void Presentarse() {
        System.out.printf(
                "Hola, me llamo: Nombre: %s y tengo %d años.%n ",
                nombre,
                edad
        );
    }
}
