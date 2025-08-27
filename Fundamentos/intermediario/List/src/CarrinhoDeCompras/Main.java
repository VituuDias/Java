package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Papel", 5.0, 5);
        carrinhoDeCompras.adicionarItem("Lapis", 1.50, 3);

        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        System.out.println(" ============ ");
        carrinhoDeCompras.removerItem("Lapis");
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();


    }
}
