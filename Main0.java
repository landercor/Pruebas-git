
public class Main0 {

    public static void main(String[] args) {

        Usuario[] usuarios = new Usuario[3];

        usuarios[0] = new Usuario("Ana", 20);
        usuarios[1] = new Usuario("Luis", 15);
        usuarios[2] = new Usuario("Marta", 30);

        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i].mostrarInfo();
        }
    }
}
