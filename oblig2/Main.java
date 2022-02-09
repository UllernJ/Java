package hiof.januj.oblig2;
import java.sql.Array;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Star sola = new Star("Sola", 1, 1, 5777);
        PlanetSystem planetSystem = new PlanetSystem("Solsystem", sola,
                new Planet("Jorda", 0.08911486599899289, 0.003146469968387777),
                new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4),
                new Planet("Saturn", 0.8145247020645666, 0.2994204425711275),
                new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4),
                new Planet("Venus", 0.08465003077267387, 0.002564278187565859),
                new Planet("Jupiter", 1.0, 1.0),
                new Planet("Uranus", 0.35475297935433336, 0.04573761854583773),
                new Planet("Neptune", 0.34440217087226543, 0.05395152792413066));
        /* definerte verdier */
        List<Planet> planets = planetSystem.getPlaneter();
        Planet saturn = planets.get(2);
        Planet neptune = planets.get(7);

        /* Oppgave 2.3 */
        System.out.println(planetSystem + "\n");

        /* Oppgave 2.4 */
        System.out.println("Navn: " + saturn.getNavn()
                + "\nMasse i KG: " + saturn.getMasseKg()
        + "\nRadius i km: " + saturn.getKmRadius());

        System.out.println("\nNavn: " + sola.getNavn() + "\nRadius i km: " + sola.getKmRadius() + "\nMasse i kg: " + sola.getSunMassKg());

        /* Oppgave 2.5 */
        System.out.println("\nNeptune gravity: " + neptune.getSurfaceGravity());

        /* Oppgave 2.6 */
        System.out.println("Største planet:" + planetSystem.getStorstePlanet());
        System.out.println("Minste planet: " + planetSystem.getMinstePlanet());
    }
}
