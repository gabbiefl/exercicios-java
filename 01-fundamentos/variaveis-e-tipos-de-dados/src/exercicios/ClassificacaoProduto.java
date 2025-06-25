package exercicios;

public class ClassificacaoProduto {

    public static String classificarProduto() {
        double preco = 150.00;
        String categoria = "";

        if (preco <= 50) {
            categoria = "Econômico";
        } else if (preco > 50 && preco < 200) {
            categoria = "Intermediário";
        } else {
            categoria = "Premium";
        }

        return "Categoria do produto: " + categoria;
    }

}
