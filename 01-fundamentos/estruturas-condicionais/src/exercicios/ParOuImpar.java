package exercicios;

public class ParOuImpar {
    public static String verificarNumero() {
        int numero = 7;

        if (numero % 2 == 0) {
            return "O número " + numero + " é par.";
        } else {
            return "O número " + numero + " é ímpar.";
        }

    }

}
