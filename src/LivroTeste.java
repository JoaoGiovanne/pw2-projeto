public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro();
        meuLivro.nome = "O Hobbit";
        meuLivro.preco = 50.99;
        meuLivro.paginas = 521;
        meuLivro.resumo = "...";

        System.out.println(meuLivro.nome);
        System.out.println(meuLivro.resumo);
        System.out.println(meuLivro.preco);
        System.out.println(meuLivro.paginas);

        Livro livroFavorito = new Livro();
    }
}
