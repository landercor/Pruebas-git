
public static void main(String[] args) {
    int i= 1;
    int ConImpares = 0;

    while (i <= 15) {
        if (i % 2 != 0) {
            ConImpares += i;
        }
        i++;
    }
    System.out.println("imprime el valor de ConImpares: " + ConImpares);
}
