public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro();
        meuLivro.nome = "O Hobbit";
        meuLivro.preco = 50.99;
        meuLivro.paginas = 521;
        meuLivro.resumo = "...";
        meuLivro.autor = "J. R. Tolkien";

        meuLivro.exibirDados();

        System.out.println("\nMeu Livro:\n");
        System.out.println("Nome: " + meuLivro.nome);
        System.out.println("Resumo: " + meuLivro.resumo);
        System.out.println("Preco: R$" + meuLivro.preco);
        System.out.println("Paginas: " + meuLivro.paginas);
        System.out.println("Autor: " + meuLivro.autor);

        Livro livroFavorito = new Livro();
        livroFavorito.nome = "Diário de um banana";
        livroFavorito.resumo = "...";
        livroFavorito.paginas = 200;
        livroFavorito.preco = 59.99;
        livroFavorito.autor = "Jeff Kinney";

        System.out.println("\nLivro Favorito:\n" );
        System.out.println("Nome: " + livroFavorito.nome);
        System.out.println("Resumo: " + livroFavorito.resumo);
        System.out.println("Preco: R$" + livroFavorito.preco);
        System.out.println("Paginas: " + livroFavorito.paginas);
        System.out.println("Autor: " + livroFavorito.autor);
    }
}
