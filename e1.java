
public class e1 {

    public static void main(String[] args) {
        int intentos = 0;

        for (int i = 1; i <= 5; i++) {
            intentos++;
            if (i == 3) {
                break;
            }
        }
        System.out.println("Numero de intentos: " + intentos);
    }
}
