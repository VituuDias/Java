package OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList = new ArrayList<>();

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade(){
        Collections.sort(pessoaList);
        for(Pessoa p : pessoaList){
            System.out.println(p);
        }
    }

    public void ordenarPorAltura(){
        pessoaList.sort(Comparator.comparingDouble(Pessoa::getAltura));
        for(Pessoa p : pessoaList){
            System.out.println(p);
        }
    }


}
