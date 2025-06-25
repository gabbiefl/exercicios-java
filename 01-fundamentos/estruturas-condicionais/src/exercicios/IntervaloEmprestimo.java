package exercicios;

import java.util.Scanner;

public class IntervaloEmprestimo {

    public static String verificarIntervalo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        int valorEmprestimo = scanner.nextInt();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000) {
            return "O valor R$ " + valorEmprestimo + " está dentro do intervalo permitido para empréstimo.";
        } else {
            return "O valor R$ " + valorEmprestimo + " não está dentro do intervalo permitido para empréstimo.";
        }
    }

}
