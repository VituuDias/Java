package ConjuntoDeConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Vitor", 1);
        conjuntoConvidados.adicionarConvidado("Mariana", 2);
        conjuntoConvidados.adicionarConvidado("a", 3);
        conjuntoConvidados.adicionarConvidado("s", 4);
        conjuntoConvidados.adicionarConvidado("v", 5);
        conjuntoConvidados.adicionarConvidado("e", 6);
        conjuntoConvidados.adicionarConvidado("b", 7);
        conjuntoConvidados.adicionarConvidado("a", 8);

        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.removerConidadoPorCodigoConvite(6);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());


    }
}
