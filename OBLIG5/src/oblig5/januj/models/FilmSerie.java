package oblig5.januj.models;

public class FilmSerie {
    private String navn;
    private double rating;
    private String sjanger;
    private String utgivelsesdato;

    public FilmSerie(String navn, double rating, String sjanger, String utgivelsesdato) {
        this.navn = navn;
        this.rating = rating;
        this.sjanger = sjanger;
        this.utgivelsesdato = utgivelsesdato;
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

    public String getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public void setUtgivelsesdato(String utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    @Override
    public String toString() {
        return "navn='" + navn + '\'' +
                ", rating=" + rating +
                ", sjanger='" + sjanger +
                ", utgivelsesdato=" + utgivelsesdato + "\n";
    }
    public String serializer() {
        return this.getNavn() + "," + this.getRating() + "," + this.getSjanger() + "," + this.getUtgivelsesdato();
    }
}
