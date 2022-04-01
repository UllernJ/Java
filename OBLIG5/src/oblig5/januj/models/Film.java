package oblig5.januj.models;

import java.util.List;

public class Film {
    private String navn;
    private double rating;
    private String sjanger;

    public Film(String navn, double rating, String sjanger) {
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
                ", sjanger='" + sjanger;
    }
    public String serializer() {
        return this.getNavn() + "," + this.getRating() + "," + this.getSjanger();
    }
}
