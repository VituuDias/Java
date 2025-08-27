package OrdenacaoDeNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumeros(10);
        ordenacaoNumeros.adicionarNumeros(31);
        ordenacaoNumeros.adicionarNumeros(5);
        ordenacaoNumeros.adicionarNumeros(140);
        ordenacaoNumeros.adicionarNumeros(1);
        ordenacaoNumeros.adicionarNumeros(34);

        System.out.println("Ordernar ascendente: ");
        ordenacaoNumeros.ordenarAscendente();
        System.out.println("==========");
        System.out.println("Ordernar Descendente: ");
        ordenacaoNumeros.ordenarDescendente();
    }
}
