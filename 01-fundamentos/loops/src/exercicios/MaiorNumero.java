package exercicios;

import java.util.Scanner;

public class MaiorNumero {

    public static String encontrarMaiorNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço: ");
        String[] numerosString = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numString : numerosString) {
            int num = Integer.parseInt(numString);

            if (num > maior) {
                maior = num;
            }
        }
        return "O maior número é: " + maior;
    }
}
