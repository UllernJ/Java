package hiof.januj.oblig4;
import hiof.januj.oblig4.models.Planet;
import hiof.januj.oblig4.models.PlanetSystem;
import hiof.januj.oblig4.models.Star;
import hiof.januj.oblig4.tools.StarCSVFileHandler;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args){

        Star sola = new Star("Sola", 1, 1, 5777);
        Star mu = new Star("MU Cas", 4.192, 4.657, 14750.0);
        Star v69 = new Star("V69-47", 1.316, 0.876, 5945.0);
        Star yz = new Star("YZ Cas", 2.547, 2.308, 9200.07);
        Star ngc = new Star("NGC188", 1.425, 1.102, 5900.0);
        Star zet = new Star("zet Phe", 2.853, 3.922, 14550.0);
        PlanetSystem planetSystem = new PlanetSystem("Solsystem", sola,
                new Planet("Jorda", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sola),
                new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sola),
                new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sola),
                new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sola),
                new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sola),
                new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380, sola),
                new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660, sola),
                new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sola));
        /* definerte verdier */
        List<Planet> planets = planetSystem.getPlaneter();
        Planet jorda = planets.get(0);
        Planet mars = planets.get(1);
        Planet saturn = planets.get(2);
        Planet mercury = planets.get(3);
        Planet venus = planets.get(4);
        Planet jupiter = planets.get(5);
        Planet uranus = planets.get(6);
        Planet neptune = planets.get(7);

        /* 2.1 */
        Collections.sort(planets);
        System.out.println(planets);

        /* 2.2 */
        StarCSVFileHandler k = new StarCSVFileHandler();
        k.writeObjectsToFile(sola, mu, v69, yz, ngc, zet);
        System.out.println(k.readObjectsFromFile());



    }
}