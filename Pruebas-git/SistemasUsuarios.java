
import SistemasUsuarios.Usuario1;

public class SistemasUsuarios {

    Usuario1[] usuarios = new Usuario1[4];

    public void cargarUsuarios() {
        // Replace 'nombre' and 'edad' with actual values or parameters as needed
        usuarios[0] = new Usuario1("nombre", edad);
        usuarios[1] = new Usuario1("Ana", 30);
        usuarios[2] = new Usuario1("Luis", 22);
        usuarios[3] = new Usuario1("Maria", 28);
    }

    public void mostrarTodos() {
        for (Usuario1 usuario : usuarios) {
            usuario.mostrarInfo();
        }
    }
}
