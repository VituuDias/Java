package Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao){
        dicionarioMap.put(palavra, descricao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirDicionario(){
        System.out.println(dicionarioMap);
    }


    public void pesquisarPorPalavra(String palavra){
        System.out.println(dicionarioMap.get(palavra));
    }


}
