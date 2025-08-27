package ConjuntoDeConvidados;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar para concurso");
        listaTarefas.adicionarTarefa("Estudar programacao");
        listaTarefas.adicionarTarefa("Estudar programacao1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println(" ============");
        listaTarefas.removeTarefa("Estudar programacao1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.obterDescricoesTarefas());
    }
}