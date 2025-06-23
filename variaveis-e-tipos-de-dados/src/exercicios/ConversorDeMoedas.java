package exercicios;

public class ConversorDeMoedas {

    public static String converterMoedas() {
        double valorReais = 451.50;
        double cambioDolar = 5.25;

        double valorConvertido = valorReais / cambioDolar;

        return "O valor em dólares é: US$ " + valorConvertido;
    }
}
