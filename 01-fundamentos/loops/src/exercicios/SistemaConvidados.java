package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaConvidados {
    public static String controlarConvidados() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        while(true) {

            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: "+ convidados);
                continue;
            }

             if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            if (convidados.contains(entrada)) {
                System.out.println("O nome " + entrada + " já está na lista de convidados.\n");
            }  else {
                convidados.add(entrada);
                System.out.println(entrada + " foi adicionado à lista de convidados.");
            }

        }
        return "Programa finalizado.";



    }
}
