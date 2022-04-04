package oblig5.januj.models;

public class Serie extends FilmSerie {
    private int episoder;

    public Serie(String navn, double rating, String sjanger, String utgivelsesdato, int episoder) {
        super(navn, rating, sjanger, utgivelsesdato);
        this.episoder = episoder;

    }

    public int getEpisoder() {
        return episoder;
    }

    public void setEpisoder(int episoder) {
        this.episoder = episoder;
    }

    @Override
    public String toString() {
        return "navn= " + getNavn() +
                ", episoder= " + episoder +
                ", sjanger= " + getSjanger() +
                ", utgivelsesdato= " + getUtgivelsesdato();
    }

    @Override
    public String serializer() {
        return super.serializer() + "," + this.episoder;
    }
}
