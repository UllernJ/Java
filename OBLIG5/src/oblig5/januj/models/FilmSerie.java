package oblig5.januj.models;

public class FilmSerie {
    private String navn;
    private double rating;
    private String sjanger;

    public FilmSerie(String navn, double rating, String sjanger) {
        this.navn = navn;
        this.rating = rating;
        this.sjanger = sjanger;
    }


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getSjanger() {
        return sjanger;
    }

    public void setSjanger(String sjanger) {
        this.sjanger = sjanger;
    }

    @Override
    public String toString() {
        return "navn='" + navn + '\'' +
                ", rating=" + rating +
                ", sjanger='" + sjanger + "\n";
    }
    public String serializer() {
        return this.getNavn() + "," + this.getRating() + "," + this.getSjanger();
    }
}
