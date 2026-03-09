
public class Librox {

    public final String titulo;
    public final String autor;

    public Librox(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.printf("Titulo: %s, Autor: %s%n", titulo, autor);
    }

    public static void main(String[] args) { //Se mezclan responsabilidades las clases que mustran o que llaman a los atributos estarian mejor en otra clase.
        Librox l1 = new Librox("Mal de ojo", "Claudia Piñeiro");
        l1.mostrarInfo();
    }
}
