package exercicios;

import java.util.Scanner;

public class ContagemDegraus {

    public static String contarDegraus() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau: " + i);
        }

        return "Você chegou ao topo!";
    }

}
