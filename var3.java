
public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
        System.out.println("Si el numero es multiplo del 4, saltar");

        if (i % 4 == 0) {
            continue;
        }
        System.out.println("numero: " + i);
    }
}
