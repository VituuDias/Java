package EstoqueDeProdutosComPreco;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1, "maça", 5, 15d);
        estoque.adicionarProduto(2, "banana", 5, 80d);
        estoque.adicionarProduto(3, "uva", 9, 5d);
        estoque.adicionarProduto(4, "morango", 15, 10d);
        estoque.adicionarProduto(5, "pera", 25, 4d);
        estoque.adicionarProduto(6, "mamão", 15, 7d);

        System.out.println("Produtos: ");
        estoque.exibirProdutos();

        System.out.println("Valor Total");
        System.out.println(estoque.calcularValorTotalEstoque());

        System.out.println("Mais Caro");
        System.out.println(estoque.obterProdutoMaisCaro());

        System.out.println("Mais Barato");
        System.out.println(estoque.obterProdutoMaisBarato());

        System.out.println("Maior quantidade valor total");
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());


    }
}
