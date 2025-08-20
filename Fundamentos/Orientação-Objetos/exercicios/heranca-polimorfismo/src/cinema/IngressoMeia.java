package cinema;

public class IngressoMeia extends Ingresso {

    public IngressoMeia() {
    }

    public IngressoMeia(double movieValue, String movieName, boolean isDublado) {
        super(movieValue, movieName, isDublado);
    }

    @Override
    public double getValue() {
        return super.getValue() / 2;
    }
}
