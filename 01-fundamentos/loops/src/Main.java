import exercicios.*;

public class Main {
    public static void main(String[] args) {

        // loops for e while

        // ex 01 - contagem de degraus
        System.out.println("\n=== Exercício 01 ===");
        System.out.println(ContagemDegraus.contarDegraus());

        // ex 02 - soma de números
        System.out.println("\n=== Exercício 02 ===");
        System.out.println(SomaNumeros.somarNumeros());

        // ex 03 - soma dos números pares
        System.out.println("\n=== Exercício 03 ===");
        System.out.println(SomaNumerosPares.somarPares());

        // ex 04 - calculadora de fatorial
        System.out.println("\n=== Exercício 04 ===");
        System.out.println(CalculadoraFatorial.calcularFatorial());

        // ex 05 - encontrando o maior número
        System.out.println("\n=== Exercício 05 ===");
        System.out.println(MaiorNumero.encontrarMaiorNumero());

        // ex 06 - monitorando tentativas de login
        System.out.println("\n=== Exercício 06 ===");
        System.out.println(TentativasLogin.monitorarLogin());

        // ex 07 - pedindo um nome válido
        System.out.println("\n=== Exercício 07 ===");
        System.out.println(ValidandoNome.validarNome());

        // ex 08 - contanto números positivos e negativos
        System.out.println("\n=== Exercício 08 ===");
        System.out.println(NumerosPositivosNegativos.contarNumeros());

        // ex 09 - pulando números que terminam em
        System.out.println("\n=== Exercício 09 ===");
        System.out.println(PulandoNumeros.pularNumeros());

        // ex 10 - sistema de controle de acesso a convidados
        System.out.println("\n=== Exercício 10 ===");
        System.out.println(SistemaConvidados.controlarConvidados());
    }
}