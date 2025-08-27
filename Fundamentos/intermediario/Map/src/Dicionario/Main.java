package Dicionario;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Morto" , "não estar vivo");
        dicionario.adicionarPalavra("Vivo" , "não estar morto");
        dicionario.adicionarPalavra("Nome" , "palavra ou locução com que se " +
                "designa uma classe de coisas, pessoas, animais.");

        dicionario.exibirDicionario();

        dicionario.pesquisarPorPalavra("Vivo");
        dicionario.removerPalavra("M");
        dicionario.exibirDicionario();





    }
}
