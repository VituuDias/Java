package cinema;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(30, "Boouu", false);
        Ingresso ingressoMeia = new IngressoMeia(30, "Boouu", false);
        IngressoFamilia ingressoFamilia = new IngressoFamilia(30, "Boouu", false);

        System.out.println("Valor do ingresso normal: " + ingresso.getValue());
        System.out.println("Valor do ingresso meia: " + ingressoMeia.getValue());
        System.out.println("Valor do ingresso familia: " + ingressoFamilia.getValue(3));

    }
}
