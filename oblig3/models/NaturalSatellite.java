package hiof.januj.oblig3.models;

public abstract class NaturalSatellite extends CelestialBody {
     private double semiMajorAxis;
     private double eccentricity;
     private int orbitalPeriod;
     private Star centralCelestialBody;

     public NaturalSatellite(String navn, double masse, double radius, double semiMajorAxis, double eccentricity, int orbitalPeriod, Star centralCelestialBody) {
         super(navn, masse, radius);
         this.semiMajorAxis = semiMajorAxis;
         this.eccentricity = eccentricity;
         this.orbitalPeriod = orbitalPeriod;
         this.centralCelestialBody = centralCelestialBody;
     }

    public NaturalSatellite(String navn, double radius, double masse, double semiMajorAxis, double eccentricity, int orbitalPeriod) {
        super(navn, radius, masse);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
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

    /* 2.5 */
    public double distanceToCentralBody(double degrees) {
         double cos = Math.cos(Math.toRadians(degrees));
         double v = getSemiMajorAxis() * (1-(getEccentricity()*getEccentricity())) / (1 + getEccentricity() * cos);
         return(v * 149597871);
    }
    /* 2.6 */
    public double orbitingVelocity(double distance) {
        double GM = 6.67408E-11 * centralCelestialBody.getMassKg();
        double r = (distance * 1000);
        double v = Math.sqrt(GM / r);

        return(v / 1000);

    }
}
