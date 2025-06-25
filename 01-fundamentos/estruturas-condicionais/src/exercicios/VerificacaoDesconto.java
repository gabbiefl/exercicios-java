package exercicios;

import java.util.Scanner;

public class VerificacaoDesconto {

    public static String verificarDesconto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.00) {
            valorCompra -= valorCompra * 0.10;
            return "Desconto de 10% aplicado. \nNovo valor: R$ " + valorCompra;
        } else {
            return "Nenhum desconto aplicado. \nValor total: " + valorCompra;
        }
    }
}
