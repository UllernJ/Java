package hiof.januj.oblig2;
import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Planet[] arr = new Planet[8];
        arr[0]  = new Planet("Jorda", 0.08911486599899289, 0.003146469968387777);
        arr[1] = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        arr[2] = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        arr[3] = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        arr[4] = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        arr[5] = new Planet("Jupiter", 1.0, 1.0);
        arr[6] = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        arr[7] = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

        Star sola = new Star("Sola", 1, 1, 5777);
        PlanetSystem planetSystem = new PlanetSystem("Solsystem", "Sola", arr.length);

        System.out.println(arr[0] +"\n");
        System.out.println(planetSystem + "\n");
        System.out.println(arr[2]);
        System.out.println("Masse i KG: " + arr[2].getMasseKg());
        System.out.println("Radius i km: " + arr[2].getKmRadius());
        System.out.println("\n" + sola);
        System.out.println("Radius i km: " + sola.getKmRadius());
        System.out.println("Masse i kg:" + sola.getSunMassKg());
        System.out.println("\nNeptune gravity: " + arr[7].getSurfaceGravity());

        double max = arr[0].getRadius();
        double min = arr[0].getRadius();
        String navnPlanetStorst = "";
        String navnPlanetMinst = "";

        /* vi sjekker etter den største og minste verdien hos radiusen */
        for(int i = 1; i < arr.length; i++) {
            if (arr[i].getRadius() > max) {
                max = arr[i].getRadius();
                navnPlanetStorst = arr[i].getNavn();
            }
            if (arr[i].getRadius() < min) {
                min = arr[i].getRadius();
                navnPlanetMinst = arr[i].getNavn();
            }
        }
        System.out.println("navn på største planet: " + navnPlanetStorst + "\nRadius: " + max);
        System.out.println("navn på største planet: " + navnPlanetMinst + "\nRadius: " + min);
    }
}