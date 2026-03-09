
public class e2 {

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;

            }
            suma += i;

        }
        System.out.println("La suma es: " + suma);
    }
}
