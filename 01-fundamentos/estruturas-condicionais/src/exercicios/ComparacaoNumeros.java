package exercicios;

import java.util.Scanner;

public class ComparacaoNumeros {

    public static String compararNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            return "O maior número é " + primeiroNumero;
        } else {
            return "O maior número é " + segundoNumero;
        }

    }
}
