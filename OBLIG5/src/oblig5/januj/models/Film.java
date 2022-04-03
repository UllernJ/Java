package oblig5.januj.models;

public class Film {
    private String utgivelsesdato;
    private FilmSerie film;

    public Film(String utgivelsesdato, FilmSerie film) {
        this.utgivelsesdato = utgivelsesdato;
        this.film = film;
    }
}
