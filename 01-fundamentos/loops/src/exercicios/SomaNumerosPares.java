package exercicios;

public class SomaNumerosPares {

    public static String somarPares() {

        int fim = 100;
        int soma = 0;

        for (int i = 1; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        return "A soma dos números pares de 1 a 100 é: " + soma;
    }
}
