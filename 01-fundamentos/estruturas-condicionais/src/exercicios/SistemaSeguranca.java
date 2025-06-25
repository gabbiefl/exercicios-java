package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaSeguranca {

    public static String verificarSeguranca() {
        int codigoCorreto = 2023;
        ArrayList<Integer> niveisPermissao = new ArrayList<Integer>();
        niveisPermissao.add(1);
        niveisPermissao.add(2);
        niveisPermissao.add(3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código de acesso: ");
        int codigoAcesso = scanner.nextInt();

        System.out.println("Digite o nível de permissão: ");
        int nivelPermissao = scanner.nextInt();


        if (codigoAcesso == codigoCorreto && niveisPermissao.contains(nivelPermissao)) {
            return "Acesso permitido. Bem-vindo ao sistema!";
        } else if (codigoAcesso != codigoCorreto && !niveisPermissao.contains(nivelPermissao)) {
            return "Acesso negado. Código de acesso e nível de permissão incorretos.";
        } else if (codigoAcesso != codigoCorreto && niveisPermissao.contains(nivelPermissao)) {
            return "Acesso negado. Código de acesso incorreto.";
        } else {
            return "Acesso negado. Nível de permissão incorreto.";
        }
    }
}
