package exercicios;

import java.util.Scanner;

public class ValidacaoSenha {

    public static String verificarSenha() {
        Scanner scanner = new Scanner(System.in);

        int senha = 123456;

        System.out.println("Digite a senha: ");
        int tentativaSenha = scanner.nextInt();


        if (tentativaSenha == senha) {
            return "Acesso permitido!";
        } else {
            return "Acesso negado!";
        }

    }
}
