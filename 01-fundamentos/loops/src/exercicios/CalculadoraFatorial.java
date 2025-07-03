package exercicios;

import java.util.Scanner;

public class CalculadoraFatorial {

    public static String calcularFatorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        return "O fatorial de " + num + " é: " + fatorial;
    }
}
