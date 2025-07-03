package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class PulandoNumeros {

    public static ArrayList<Integer> pularNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= numero; i++) {
            if (i % 10 == 5) {
                continue;
            }
            numeros.add(i);
        }

        return numeros;
    }
}
