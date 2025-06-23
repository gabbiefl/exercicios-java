package exercicios;

public class PlanejamentoViagem {

    public static String calcularConsumo() {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        String mensagem;

        if (autonomiaAtual >= distanciaViagem) {
            mensagem = "Você conseguirá completar a viagem sem precisar abastecer.";
        } else {
            mensagem = "Você terá que abastecer.";
        }

        return "Autonomia máxima do veículo: " + autonomiaMaxima + " km" + "\nAutonomia atual: " + autonomiaAtual + " km\n"+ mensagem;

    }
}
