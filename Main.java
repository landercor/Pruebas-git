
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Lista dinámica de personas
        ArrayList<Persona> personas = new ArrayList<>();

        // Agregamos usuarios usando el constructor
        personas.add(new Persona("Daniel Dan", 19));
        personas.add(new Persona("Alvarez Can", 32));
        personas.add(new Persona("Perez Rem", 12));

        // Recorremos la lista con for-each
        for (Persona p : personas) {
            if (p.datosValidos()) {
                p.presentarse();
                p.mostrarResumen();
                System.out.println("Clasificación: " + p.clasificarEdad());
            }

            if (p.esMayorDeEdad()) {
                System.err.println("Acceso permitido");
            } else {
                System.err.println("Acceso denegado");
            }

            System.out.println("-------------");
        }
    }
}
