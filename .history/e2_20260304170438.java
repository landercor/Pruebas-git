
public class e2 {

    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {

                if (i == j) {
                    continue;
                }
                contador++;
            }

        }
        System.out.println("La suma es: " + contador);
    }
}
