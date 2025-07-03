package exercicios;

import java.util.Scanner;

public class NumerosPositivosNegativos {

    public static String contarNumeros() {

        Scanner scanner = new Scanner(System.in);

        int negativos = 0;
        int positivos = 0;

        while(true) {

            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);

            if (numero < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }

        return "Números positivos: " + positivos + "\nNúmeros negativos: " + negativos;
    }
};
