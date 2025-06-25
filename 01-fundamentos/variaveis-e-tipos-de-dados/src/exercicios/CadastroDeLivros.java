package exercicios;

public class CadastroDeLivros {

    public static String cadastrarLivro() {
        String titulo = "";
        String autor = "";
        int numeroDePaginas = 0;
        double precoLivro = 0.0;
        String categoria = "";
        char escolha = 'F';

        if (escolha == 'F') {
            titulo = "O Pequeno Príncipe";
            autor = "Antoine de Saint-Exupéry";
            numeroDePaginas = 96;
            precoLivro = 39.9;
            categoria = "Ficção";
        } else if (escolha == 'N') {
            titulo = "Sociedade do Cansaço";
            autor = "Byung-Chul Han";
            numeroDePaginas = 136;
            precoLivro = 37.8;
            categoria = "Não-Ficção";
        } else if (escolha == 'T') {
            titulo = "Código Limpo";
            autor = "Robert Cecil Martin";
            numeroDePaginas = 425;
            precoLivro = 76.3;
            categoria = "Tecnologia";
        } else if (escolha == 'H') {
            titulo = "Diário de Anne Frank";
            autor = "Anne Frank";
            numeroDePaginas = 352;
            precoLivro = 34.9;
            categoria = "História";
        }

        return "Livro cadastrado: " + titulo + ", de " + autor + "." + " Ele possui " + numeroDePaginas + " páginas, custa R$ " + precoLivro + " e pertente à categoria " + categoria + ".";


    }
}
