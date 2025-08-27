package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itemList = new ArrayList<>();
    double total;

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        total = 0;
        for(Item i : itemList){
            total += (i.getPreco() * i.getQuantidade());
        }
        return total;
    }

    public void exibirItens(){
        for(Item i : itemList){
            System.out.println("Item: i.getNome()" + ", preco: " + i.getPreco() + ", quantidade: " + i.getQuantidade());
        }
    }
}
