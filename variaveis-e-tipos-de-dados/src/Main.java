import exercicios.*;

public class Main {
    public static void main(String[] args) {

        // váriaveis e tipos de dados

        // ex 01 - declarando valores a variáveis
        System.out.println("\n=== Exercício 01 ===");
        System.out.println(DeclarandoValores.declararValor());

        // ex 02 - conversão de tipos
        System.out.println("\n=== Exercício 02 ===");
        System.out.println(ConversaoDeTipos.conveterTipo());

        // ex 03 - primitivos em ação
        System.out.println("\n=== Exercício 03 ===");
        System.out.println(PrimitivosEmAcao.calcularMedia());

        // ex 04 - conversão de temperatura
        System.out.println("\n=== Exercício 04 ===");
        System.out.println(ConversaoDeTemperatura.converterTemperatura());

        // ex 05 - cadastro de livros
        System.out.println("\n=== Exercício 05 ===");
        System.out.println(CadastroDeLivros.cadastrarLivro());

        // ex 06 - classificação por categoria
        System.out.println("\n=== Exercício 06 ===");
        System.out.println(ClassificacaoProduto.classificarProduto());

        // ex 07 - número par ou ímpar
        System.out.println("\n=== Exercício 07 ===");
        System.out.println(ParOuImpar.verificarNumero());

        // ex 08 - conversor de moedas
        System.out.println("\n=== Exercício 08 ===");
        System.out.println(ConversorDeMoedas.converterMoedas());

        // ex 09 - verificação de idade e escopo de váriaveis
        System.out.println("\n=== Exercício 09 ===");
        System.out.println(VerificacaoDeIdade.verificarIdade());

        // ex 10 - planejando uma viagem: consumo e autonomia
        System.out.println("\n=== Exercício 10 ===");
        System.out.println(PlanejamentoViagem.calcularConsumo());
    }
}