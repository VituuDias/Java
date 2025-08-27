package ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String description){
        tarefaSet.add(new Tarefa(description));
    }

    public void removerTarefa(String description){
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescription() == description){
                tarefaParaRemover = t;
            }
        }
        if(tarefaParaRemover == null){
            System.out.println("Não existem tarefas com essa descrição");
        }
        System.out.println("Tarefa " + tarefaParaRemover.getDescription() + " removida!");
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }
        System.out.println("Não há tarefas!");

    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.getTaferaIsCompleted() == true){
                tarefasConcluidas.add(t);
            }
        }
        if(tarefasConcluidas.isEmpty()){
            System.out.println("Não há tarefas concluidas");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.getTaferaIsCompleted() == false){
                tarefasPendentes.add(t);
            }
        }
        if(tarefasPendentes.isEmpty()){
            System.out.println("Não há tarefas pendentes");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String description){
        for(Tarefa t : tarefaSet){
            if(t.getDescription() == description){
                t.setTaferaIsCompleted(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String description){
        for(Tarefa t : tarefaSet){
            if(t.getDescription() == description){
                t.setTaferaIsCompleted(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

}
