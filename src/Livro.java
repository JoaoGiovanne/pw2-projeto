public class Livro {
    String nome;
    String resumo;
    double preco;
    int paginas;
    String autor;

    void exibirDados(){ /* função em Java*/
        System.out.println("Nome: " + nome);
        System.out.println("Resumo: " + resumo);
        System.out.println("Preco: R$" + preco);
        System.out.println("Paginas: " + paginas);
        System.out.println("Autor: " + autor);
        System.out.println("-------------------------");
    }
}
