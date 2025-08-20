package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "FELIPE", "VITOR", "MARI", "PAULO", "GUILHERME", "MONICA", "MIRELA", "LUIZ", "MARCIA",
                "FABRICIO", "LUCAS" };

        for(String candidato : selecionandoCandidatos(candidatos)){
            entrandoEmContado(candidato);
        }

    }

    static void entrandoEmContado(String candidatosSelecionados) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        System.out.println("ENTRANDO EM CONTATO COM " + candidatosSelecionados);

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;

            }

        }while(continuarTentando && tentativasRealizadas < 3);


        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidatosSelecionados + " NA " + tentativasRealizadas + " TENTATIVA\n");
        else   
            System.out.println("NÃO CONSEGUIMOS CONTATOS COM " + candidatosSelecionados + ", NÚMERO MAXIMO " + tentativasRealizadas + " REALIZADAS\n");

    }   

    static String [] selecionandoCandidatos(String[] candidatos) {
        
        String[] tempCandidatosSelecionados = new String[5];

        double salarioBase = 2000.0;
        int quantidadeCandidatosSelecionados = 0;
        int candidatoAtual = 0;

        System.out.println("SELECIONANDO CANDIDATOS: \n");

        while (quantidadeCandidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            if (salarioBase >= salarioPretendido) {
                tempCandidatosSelecionados[quantidadeCandidatosSelecionados] = candidato;
                quantidadeCandidatosSelecionados++;
                System.out.printf("Candidato %s selecionado com salário pretendido de R$ %.2f%n", candidato,
                salarioPretendido);
            }
            candidatoAtual++;

        }


        String[] candidatosSelecionados = new String[quantidadeCandidatosSelecionados];
    System.arraycopy(tempCandidatosSelecionados, 0, candidatosSelecionados, 0, quantidadeCandidatosSelecionados);

        return candidatosSelecionados;

    }

    // simula a ligação se o valor 1 a 3 for igual a um, não atendeu.
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(String[] candidatosSelecionados) {
        for (String selecionado : candidatosSelecionados) {
            System.out.println("Candidato selecionado: " + selecionado);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidado(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO!");
        else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
    }
}
