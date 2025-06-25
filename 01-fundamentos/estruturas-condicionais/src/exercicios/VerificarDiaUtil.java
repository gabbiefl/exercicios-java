package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class VerificarDiaUtil {

    public static String verificarDia() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana (sem acentos):");
        String diaDaSemana = scanner.nextLine().toLowerCase(Locale.ROOT);

        return switch (diaDaSemana) {
            case "segunda" -> "Segunda é um dia útil.";
            case "terça" -> "Terça é um dia útil.";
            case "quarta" -> "Quarta é um dia útil.";
            case "quinta" -> "Quinta é um dia útil.";
            case "sexta" -> "Sexta é um dia útil.";
            case "sábado" -> "Sábado não é um dia útil.";
            case "domingo" -> "Domingo não é um dia útil.";
            default -> "Dia da semana inválido";
        };


    }
}
