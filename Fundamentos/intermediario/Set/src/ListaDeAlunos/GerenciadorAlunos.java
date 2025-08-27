package ListaDeAlunos;

import ListaDeTarefas.Tarefa;
import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        for(Aluno t : alunoSet){
            if(t.getMatricula() == matricula){
                alunoParaRemover = t;
            }
        }
        if(alunoParaRemover == null){
            System.out.println("Não existem tarefas com essa matricula");
        }
        System.out.println("Tarefa " + alunoParaRemover.getMatricula() + " removida!");
        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorMatricula() {
        Set<Aluno> alunosPorMatricula = new TreeSet<>(new ComparatorPorNota());
        if(!alunoSet.isEmpty()){
            alunosPorMatricula.addAll(alunoSet);
            return alunosPorMatricula;
        }else{
            throw new RuntimeException("O conjunto está vazio");
        }

    }
}
