package hiof.januj.oblig3.models;

/* 2.1 */
public class CelestialBody {
    private String navn;
    private static double radius;
    private static double masse;

    public CelestialBody(String navn, double radius, double masse) {
    this.navn = navn;
    this.radius = radius;
    this.masse = masse;

    }

    public String toString() {
        return("\nNavn: " + navn + ", Radius: " + radius +", Masse: " + masse);
    }


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public static double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

    public double getSunRadiusKm() {
        return(getRadius()*1.98892E30);
    }
    public double getSunMassKg() {
        return(getMasse()*695700);
    }

    public static final double getMasseKg() {
        return(getMasse() *1.898E27);
    }
    public static final double getKmRadius() {
        return(getRadius()*71492);
    }
}

