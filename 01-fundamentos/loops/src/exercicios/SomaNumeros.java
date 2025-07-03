package exercicios;

import java.util.ArrayList;

public class SomaNumeros {

    public static String somarNumeros() {
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(10);
        valores.add(20);
        valores.add(30);
        valores.add(40);
        valores.add(50);

        int soma = 0;

//        for (type variableName : arrayName) {}
        for (int n : valores) {
            soma += n;
        }
        return "A soma total das receitas é: " + soma;

    }
}
