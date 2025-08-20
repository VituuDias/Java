public class ExemploFor{

    public static void main(String[] args) {
        // for (int i = 0; i< 10; i++){
        //     System.out.println("Contador: " + i);
        // }  
        
        String alunos[] = {"Felipe", "Vitor", "Mariana"};

        for(int i=0; i<alunos.length; i++){
            System.out.println("O aluno no indice i= " + i + " é " + alunos[i]);
        }

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

    }

}