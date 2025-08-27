package SomaDeNumeros;

public class Main {

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);

        somaNumeros.exibirNumero();
        System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();

    }

}
