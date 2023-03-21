public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro();
        meuLivro.nome = "O Hobbit";
        meuLivro.preco = 50.99;
        meuLivro.paginas = 521;
        meuLivro.resumo = "...";
        meuLivro.autor = "J. R. Tolkien";

        meuLivro.aplicarDesconto(0.15);
        meuLivro.exibirDados();

        Livro livroFavorito = new Livro();
        livroFavorito.nome = "Diário de um banana";
        livroFavorito.resumo = "...";
        livroFavorito.paginas = 200;
        livroFavorito.preco = 59.99;
        livroFavorito.autor = "Jeff Kinney";

        livroFavorito.aplicarDesconto(0.25);
        livroFavorito.exibirDados();

    }
}
