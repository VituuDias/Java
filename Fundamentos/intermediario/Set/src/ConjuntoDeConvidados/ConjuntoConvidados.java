package ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConidadoPorCodigoConvite(int codigoConvite){
        Convidados convidadosParaRemover = null;
        for(Convidados c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadosParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadosParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

}
