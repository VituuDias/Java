package SomaDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList = new ArrayList<>();

    public SomaNumeros(List<Integer> numerosList) {
        this.numerosList = numerosList;
    }

    public SomaNumeros() {
    }

    public List<Integer> getNumerosList() {
        return numerosList;
    }

    public void setNumerosList(List<Integer> numerosList) {
        this.numerosList = numerosList;
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public double calcularSoma(){
        double soma = 0;
        for(Integer i : numerosList){
            soma += i;
        }
        return soma;
    }

    public void encontrarMaiorNumero(){
        System.out.println("Maior numero: " + Collections.max(numerosList));
    }

    public void encontrarMenorNumero(){
        System.out.println("Menor numero: " + Collections.min(numerosList));
    }

    public void exibirNumero(){
        for(Integer i : numerosList){
            System.out.println("Número " + (numerosList.indexOf(i)+1) + " = " + i);
        }
    }

}
