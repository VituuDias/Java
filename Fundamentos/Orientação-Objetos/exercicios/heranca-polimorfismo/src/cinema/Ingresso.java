package cinema;

public class Ingresso {
    private double movieValue;
    private String movieName;
    private boolean isDublado;

    public Ingresso() {

    }

    public Ingresso(double movieValue, String movieName, boolean isDublado) {
        this.movieValue = movieValue;
        this.movieName = movieName;
        this.isDublado = isDublado;
    }

    public double getMovieValue() {
        return movieValue;
    }

    public void setMovieValue(double movieValue) {
        this.movieValue = movieValue;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public boolean isDublado() {
        return isDublado;
    }

    public void setDublado(boolean isDublado) {
        this.isDublado = isDublado;
    }

    public double getValue() {
        return movieValue;
    }

}
