package test;

import java.util.Scanner;
import static calculadora.Operaciones.*;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Proporciona el segundo valor: ");
        int b = scanner.nextInt();
        int resultado = multiplicar(a, b);
        System.out.println("Resultado = " + resultado);
    }
}
