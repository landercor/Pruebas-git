
public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.nombre = "ana";
        usuario1.edad = 25;
        Usuario usuario2 = new Usuario();
        usuario2.nombre = "bela";
        usuario2.edad = 23;

        usuario1.Saludar();
        usuario2.Saludar();
    }
}
