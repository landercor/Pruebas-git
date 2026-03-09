
public static void main(String[] args) {
    for (int i =1; i <= 3; i++) {
        System.out.println("Procesando personas " + i);

        if (i == 2) {
            System.out.println("perosnonas con datos invalidos omite, se omite");
            continue;

        }
        System.out.println("Persona procesada " + i);
    }
}
