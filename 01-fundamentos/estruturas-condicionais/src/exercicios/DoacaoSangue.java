package exercicios;

import java.util.Scanner;

public class DoacaoSangue {

    public static String verificarCompatibilidade() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do doador:");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso do doador (em kg):");
        Double peso = scanner.nextDouble();


        boolean idadeCompativel = idade >= 18 && idade <= 65;
        boolean pesoCompativel = peso > 50;
        String motivo = "";

        if (idadeCompativel && pesoCompativel) {
            return "O doador é compatível";
        } else {
            if (!idadeCompativel && !pesoCompativel) {
                motivo = "Deve ter entre 18 e 65 anos e pesar mais que 50kg";
            }

            if (!idadeCompativel) {
                motivo = "Deve ter entre 18 e 65 anos.";
            }
            if (!pesoCompativel)
                motivo = "Deve pesar mais que 50kg";

        }
        return "O doador não é compatível. \nMotivo: " + motivo;

    }

}
