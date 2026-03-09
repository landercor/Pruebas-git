
public static void main(String[] args) {
    String[] users = {"ana", "juan", "maria", "root", "admin"};
    int contador = 0;

    for (String user : users) {
        if (user.length() > 4) {
            contador++;
        }
    }
    System.out.println("Número de usuarios con más de 4 caracteres: " + contador);
}
