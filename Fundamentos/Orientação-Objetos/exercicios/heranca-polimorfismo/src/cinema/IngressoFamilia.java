package cinema;

public class IngressoFamilia extends Ingresso {

    public IngressoFamilia() {

    }

    public IngressoFamilia(double movieValue, String movieName, boolean isDublado) {
        super(movieValue, movieName, isDublado);
    }

    public double getValue(int quantidade) {
        double total = super.getMovieValue() * quantidade;
        if (quantidade > 3) {
            return total *= 0.95;
        }
        return total;
    }
}
