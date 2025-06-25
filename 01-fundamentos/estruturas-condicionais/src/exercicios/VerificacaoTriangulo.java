package exercicios;

import java.util.Scanner;

public class VerificacaoTriangulo {
    public static String verificarTriangulo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int primeiroLado = scanner.nextInt();

        System.out.println("Digite o segundo lado: ");
        int segundoLado = scanner.nextInt();

        System.out.println("Digite o terceiro lado: ");
        int terceiroLado = scanner.nextInt();

        if (primeiroLado + segundoLado > terceiroLado && primeiroLado + terceiroLado > segundoLado && segundoLado + terceiroLado > primeiroLado) {
            return "Os lados podem formar um triângulo.";
        } else {
            return "Os lados não podem formar um triângulo.";
        }
    }
}
