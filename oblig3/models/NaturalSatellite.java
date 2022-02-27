package hiof.januj.oblig3.models;

public abstract class NaturalSatellite extends CelestialBody {
     private double semiMajorAxis;
     private double eccentricity;
     private int orbitalPeriod;
     private Star centralCelestialBody;

     public NaturalSatellite(double semiMajorAxis, double eccentricity, int orbitalPeriod, Star centralCelestialBody, String navn, double masse, double radius) {
         super(navn, masse, radius);
         this.semiMajorAxis = semiMajorAxis;
         this.eccentricity = eccentricity;
         this.orbitalPeriod = orbitalPeriod;
         this.centralCelestialBody = centralCelestialBody;
     }

    public NaturalSatellite(String navn, double radius, double masse) {
        super(navn, radius, masse);
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Star getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(Star centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }
}
