package exercicios;

public class ConversaoDeTemperatura {

    public static String converterTemperatura() {
        int temperaturaCelsius = 20;
        double temperaturaParaFahrenheit = (temperaturaCelsius * 9 / 5.0) + 32;

        return "A temperatura em graus Fahrenheit é: " + temperaturaParaFahrenheit;
    }

}
