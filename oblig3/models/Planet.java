package hiof.januj.oblig3.models;

public class Planet extends NaturalSatellite {

    public Planet(String navn, double radius, double masse, double semiMajorAxis, double eccentricity, int orbitalPeriod) {
        super(navn, radius, masse);
    }

    public static final double getSurfaceGravity() {
        return(( 6.67408E-11 * getMasseKg())/ (getKmRadius()*1000*getKmRadius()*1000));
    }


}
