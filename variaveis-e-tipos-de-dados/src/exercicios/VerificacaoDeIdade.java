package exercicios;

public class VerificacaoDeIdade {
    public static String verificarIdade() {
        int idade = 17;
        String mensagem;

        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        return mensagem;
    }
}
