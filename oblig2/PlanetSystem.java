package hiof.januj.oblig2;
import java.util.Arrays;
import java.util.List;

public class PlanetSystem {
    private String navn;
    private Star centerStar;
    private List<Planet> planeter;

    public PlanetSystem(String navn, Star centerStar, List<Planet> planeter) {
        this.navn = navn;
        this.centerStar = centerStar;
        this.planeter = planeter;
    }

    public PlanetSystem(String navn, Star centerStar, Planet... planeter) {
        this.navn = navn;
        this.centerStar = centerStar;
        this.planeter = Arrays.asList(planeter);
    }

    public String toString() {
        return("Navn:" + navn + "\nCenter Star:" + centerStar + "\nAntall planeter:" + planeter);
    }

    public String getNavn() {
        return navn;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public List<Planet> getPlaneter() {
        return planeter;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public void setPlaneter(List<Planet> planeter) {
        this.planeter = planeter;
    }

    /* Oppgave 2.6 */
    public Planet getStorstePlanet() {
        Planet biggestPlanet = null;
        for(Planet planet : planeter) {
            if(biggestPlanet == null) { biggestPlanet = planet; }
            if (planet.getRadius() > biggestPlanet.getRadius()) {
                biggestPlanet = planet;
            }
            else if(biggestPlanet.getRadius() == planet.getRadius()) {
                if (planet.getMasse() > biggestPlanet.getMasse()) {
                    biggestPlanet = planet;
                }
            }
        }
        return biggestPlanet;
    }
    public Planet getMinstePlanet() {
        Planet minstePlanet = null;
        for(Planet planet : planeter) {
            if(minstePlanet == null) { minstePlanet = planet; }
            if (planet.getRadius() < minstePlanet.getRadius()) {
                minstePlanet = planet;
            }
            else if(minstePlanet.getRadius() == planet.getRadius()) {
                if (planet.getMasse() < minstePlanet.getMasse()) {
                    minstePlanet = planet;
                }
            }
        }
        return minstePlanet;
    }
}

