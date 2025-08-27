package ListaDeTarefas;

public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Estudar");
        listaTarefa.adicionarTarefa("Ler");
        listaTarefa.adicionarTarefa("Desenhar");
        listaTarefa.adicionarTarefa("Jogar");
        listaTarefa.adicionarTarefa("Assistir filme");
        listaTarefa.adicionarTarefa("Arrumar a casa");

        listaTarefa.removerTarefa("Estudar");
        listaTarefa.exibirTarefas();

        System.out.println(listaTarefa.contarTarefas());

        System.out.println("Tarefas concluidas: ");
        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: ");
        System.out.println(listaTarefa.obterTarefasPendentes());

        System.out.println("Marcando");
        listaTarefa.marcarTarefaConcluida("Jogar");
        System.out.println("Tarefas concluidas: ");
        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: ");
        System.out.println(listaTarefa.obterTarefasPendentes());

        System.out.println("Marcando2");
        listaTarefa.marcarTarefaPendente("Jogar");
        System.out.println("Tarefas concluidas: ");
        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: ");
        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();


    }
}
