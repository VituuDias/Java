package EstoqueDeProdutosComPreco;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos(){
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
               valorTotalEstoque += (p.getQuantidade() * p.getPreco());
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
               if(p.getPreco() > maiorPreco){
                   produtoMaisCaro = p;
                   maiorPreco = p.getPreco();
               }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidade = null;
        double maiorValorTotal = Double.MIN_VALUE;

        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                double valorTotalProduto = p.getPreco() * p.getQuantidade();
                if(valorTotalProduto > maiorValorTotal){
                    produtoMaiorQuantidade = p;
                    maiorValorTotal = valorTotalProduto;

                }
            }
        }
        return produtoMaiorQuantidade;
    }

}
