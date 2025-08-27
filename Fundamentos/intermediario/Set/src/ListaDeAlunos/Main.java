package ListaDeAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Vitor", 232323, 6);
        gerenciadorAlunos.adicionarAluno("Mariana", 1232353, 3);
        gerenciadorAlunos.adicionarAluno("P", 1233124, 4);
        gerenciadorAlunos.adicionarAluno("G", 5434432, 5);
        gerenciadorAlunos.adicionarAluno("B", 1242334, 8);

        System.out.println(gerenciadorAlunos.exibirAlunosPorMatricula());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        gerenciadorAlunos.removerAluno(1242334);
        gerenciadorAlunos.exibirAlunosPorNome();




    }

}
