package exercicios;

public class VerificacaoMedia {
    public static String verificarAprovacao() {

        double media = 4.3;

        if (media >= 7) {
            return "O estudante teve média " + media + " e foi aprovado.";
        } else if (media >= 5 && media <= 6.9) {
            return "O estudante teve média " + media + " e está de recuperação.";
        } else {
            return "O estudante teve média " + media + " e foi reprovado.";
        }
    }
}
