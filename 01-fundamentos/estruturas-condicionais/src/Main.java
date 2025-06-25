import exercicios.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // condicionais if e else

        // ex 01 - verificando se um número é par ou ímpar
        System.out.println("\n=== Exercício 01 ===");
        System.out.println(ParOuImpar.verificarNumero());

        // ex 02 - verificando aprovação em uma disciplina
        System.out.println("\n=== Exercício 02 ===");
        System.out.println(VerificacaoMedia.verificarAprovacao());

        // ex 03 - validação de senha
        System.out.println("\n=== Exercício 03 ===");
        System.out.println(ValidacaoSenha.verificarSenha());

        // ex 04 - comparando dois números
        System.out.println("\n=== Exercício 04 ===");
        System.out.println(ComparacaoNumeros.compararNumeros());

        // ex 05 - verificação de desconto em compras
        System.out.println("\n=== Exercício 05 ===");
        System.out.println(VerificacaoDesconto.verificarDesconto());

        // ex 06 - verificação de dia útil
        System.out.println("\n=== Exercício 06 ===");
        System.out.println(VerificarDiaUtil.verificarDia());

        // ex 07 - verificando se um número está em um intervalo
        System.out.println("\n=== Exercício 07 ===");
        System.out.println(IntervaloEmprestimo.verificarIntervalo());

        // ex 08 - verificação de triângulo
        System.out.println("\n=== Exercício 08 ===");
        System.out.println(VerificacaoTriangulo.verificarTriangulo());

        // ex 09 - verificação de compatibilidade de doação de sangue
        System.out.println("\n=== Exercício 09 ===");
        System.out.println(DoacaoSangue.verificarCompatibilidade());

        // ex 10 - verificação de código de acesso e nível de permissão
        System.out.println("\n=== Exercício 10 ===");
        System.out.println(SistemaSeguranca.verificarSeguranca());
    }
}