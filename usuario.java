
public class usuario {

    public void actualizarEdad(int edad) {
        this.edad = edad;
    }

    public void actualizeGustos(Gustos gustos) {
        this.gustos = gustos;
    }

    public enum Gustos {
        HELADO,
        NADA,
        QUESO;
    }

    String nombre;
    int edad;
    String email;
    Gustos gustos;

    public usuario(String nombre, int edad, String email, String gustos) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.gustos = Gustos.valueOf(gustos.toUpperCase());
    }

    void EsMayorDeEdad() {
        if (edad >= 12) {
            System.out.println("El usuario es mayor de edad.");

        } else if (edad <= 12) {
            System.out.println("El usuario es menor de edad.");
        }
    }

    void LeGusta() {
        this.gustos = Gustos.HELADO;
        System.out.println("Al usuario le gusta lo bueno.");
    }

    void ActualizarEmail(String email) {
        this.email = email;
        System.err.println("Email actualizado a: " + this.email);
    }

    void MostrarDatos() {
        System.out.printf("Nombre: %s%nEdad: %d%nEmail: %s%nGustos: %s%n", nombre, edad, email, gustos);
        switch (gustos) {
            case HELADO ->
                System.out.println("Al usuario le gusta el helado.");
            case NADA ->
                System.out.println("Al usuario no le gusta nada.");
            case QUESO ->
                System.out.println("Al usuario le gusta el queso.");
            default ->
                System.out.println("Gustos no especificados.");

        }
    }
}
