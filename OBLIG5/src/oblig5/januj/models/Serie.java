package oblig5.januj.models;

public class Serie extends Film {
    private int episoder;

    public Serie(String utgivelsesdato, FilmSerie film, int episoder) {
        super(utgivelsesdato, film);
        this.episoder = episoder;

    }

}
