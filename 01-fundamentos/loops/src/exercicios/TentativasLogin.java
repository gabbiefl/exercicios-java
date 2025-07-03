package exercicios;

import java.util.Scanner;

public class TentativasLogin {

    public static String monitorarLogin() {

        Scanner scanner = new Scanner(System.in);
        int senha = 1234;
        int tentativas = 3;
        int tentativaSenha = 0;

        while (tentativas != 0 && tentativaSenha != senha) {

            System.out.println("Digite sua senha: ");
            tentativaSenha = scanner.nextInt();

            if (tentativaSenha != senha) {
                tentativas--;
                System.out.println("Senha incorreta. Você tem " + tentativas + " tentativas restantes.");
            }
        }

        if (tentativas == 0) {
            return "Conta bloqueada temporariamente.";
        } else {
            return "Senha Correta! Acesso concedido!";
        }

    }

}
