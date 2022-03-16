package hiof.januj.oblig4.models;

public class Planet extends NaturalSatellite {

    public Planet(String navn, double radius, double masse, double semiMajorAxis, double eccentricity, int orbitalPeriod, Star centralCelestialBody) {
        super(navn, radius, masse, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    public final double getSurfaceGravity() {
        return(( 6.67408E-11 * getMassKg())/ (getRadiusKm()*1000*getRadiusKm()*1000));
    }


    public final double getMassKg() {
        return(getMasse() *1.898E27);
    }

    public final double getRadiusKm() {
        return(getRadius()*71492);
    }

    /* 2.1 */
    @Override
    public int compareTo(CelestialBody o) {
        if(this.getRadiusKm() == o.getRadiusKm()) return 0;
        if(this.getRadiusKm() < o.getRadiusKm()) return 1;
        else return -1;
    }

}
