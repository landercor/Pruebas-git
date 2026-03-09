
public static void main(String[] args) {
    
    String[] users = {"ana", "juan", "maria", "root", "admin"};
    boolean encontrado = false;

    for (String user : users) {
        if (user.equals("juan")) {
            encontrado = true;
            break;
        }
    }
    if (encontrado) {
        System.out.println("User encontrado");
    } else {
        System.out.println("user no encontrado");

    }
}
