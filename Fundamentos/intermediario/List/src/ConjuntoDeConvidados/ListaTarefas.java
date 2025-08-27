package ConjuntoDeConvidados;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public ArrayList obterDescricoesTarefas() {
        ArrayList<String> descricoesList = new ArrayList<>();
        for (var v : tarefas) {
            descricoesList.add(v.getDescricao());
        }
        return descricoesList;
    }

}
