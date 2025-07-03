package exercicios;

import java.util.Scanner;

public class ValidandoNome {

    public static String validarNome() {

        Scanner scanner = new Scanner(System.in);
        String nome = "";

        do {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            if (nome.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");
            }
        } while(nome.length() < 3);

        return "Nome " + nome + " cadastrado com sucesso!";
    }
}
