
public class libros {

    String titulo;
    String autor;
    int anioPublicacion;

    public libros(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo() {
        System.out.println(
                "Título: " + titulo
                + " | Autor: " + autor
                + " | Año: " + anioPublicacion
        );
    }

    public boolean esAntiguo() {
        return anioPublicacion < 2000;
    }
}
