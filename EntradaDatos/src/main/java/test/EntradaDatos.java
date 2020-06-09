package test;

import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {
        String captura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un Dato:");
        captura = scanner.nextLine();
        System.out.println("Dato introducido: " + captura);

        while (!"salir".equals(captura)) {
            System.out.println("Introduce un valor: ");
            captura = scanner.nextLine();
            System.out.println("Dato introducido: " + captura);
        }
    }
}
