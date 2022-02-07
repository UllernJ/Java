package hiof.januj.oblig2;

public class PlanetSystem {
    private String navn;
    private String centerStar;
    private int planeter;

    public PlanetSystem(String navn, String centerStar, int planeter) {
        this.navn = navn;
        this.centerStar = centerStar;
        this.planeter = planeter;
    }

    public String toString() {
        return("Navn:" + navn + "\nCenter Star:" + centerStar + "\nAntall planeter:" + planeter);
    }

}

