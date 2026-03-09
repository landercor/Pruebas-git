
public class Pelicula {

    String nombre;
    String descripcion;
    int numeroPelis;
    boolean visto;
    boolean esParaAdulto;
    int duracion;
    int edad;

    public Pelicula(String nombre, String descripcion, int numeroPelis,
            boolean visto, boolean esParaAdulto, int duracion, int edad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPelis = numeroPelis;
        this.visto = false;
        this.esParaAdulto = false;
        this.duracion = duracion;
        this.edad = edad;
    }

    public void mostrarInfop() {
        System.out.printf(
                "Nombre: %s%ndescripcion: %s%nedad: %s%nnumeroPelis: %s%nesParaAdulto: %s%nduracion: %s%nvisto: %s%n",
                nombre
                + descripcion,
                +numeroPelis,
                esParaAdulto ? "si" : "no", esParaAdulto,
                duracion,
                visto ? "si" : "no", visto,
                edad
        );
    }

    public boolean esLargo() {
        return duracion > 120;
    }

}
