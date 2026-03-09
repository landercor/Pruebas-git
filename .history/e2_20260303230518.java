
public class e2 {

    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {

                if (i == j) {
                    continue;
                }
                contador++;
            }

        }
        System.out.println("La suma es: " + contador);
    }
}
