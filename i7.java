
public static void main(String[] args) {
    int i = 1;
    int nombres = 5;

    while (i < nombres) {

        String[] user = {"ana", "luis", "tela", "mistersecret", "root", "admin"};

        System.out.println("Recorrido de los nombres: " + user[i]);
        if (user[i].equals("root")) {

            System.out.println("admin encontrado: " + user[i]);
        } else if (user[i].equals("admin")) {

            System.out.println("user normal: " + user[i]);
        }
        i++;
    }
}
