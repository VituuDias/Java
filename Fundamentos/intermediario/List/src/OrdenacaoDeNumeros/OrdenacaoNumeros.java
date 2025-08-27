package OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> numeros = new ArrayList<>();

    public void adicionarNumeros(int numero){
        numeros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(numeros);
        for(Integer i : numeros){
            System.out.println(i);
        }
    }

    public void ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
        numerosDescendente.sort( Collections.reverseOrder());
        for(Integer i : numerosDescendente){
            System.out.println(i);
        }
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "numeros = " + numeros;
    }
}
