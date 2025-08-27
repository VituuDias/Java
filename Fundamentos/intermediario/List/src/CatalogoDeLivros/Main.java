package CatalogoDeLivros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivros("Hoje", "vitor", 2000);
        livros.adicionarLivros("Amanha", "joao", 2003);
        livros.adicionarLivros("Amanha", "vitor", 2003);
        livros.adicionarLivros("Ontem", "vitor", 2005);
        livros.adicionarLivros("Passado", "Mariana", 2020);
        livros.adicionarLivros("Presente", "Mariana", 2021);
        livros.adicionarLivros("Futuro", "Mariana", 2022);
        livros.adicionarLivros("Lugar", "Joao", 2400);

        livros.pesquisarPorAutor("Mariana");
        System.out.println("==============");
        livros.pesquisarPorIntervaloAnos(2019, 2025);
        System.out.println("===========");
        livros.pesquisarPorTitulo("Amanha");


    }
}
