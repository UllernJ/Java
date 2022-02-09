package hiof.januj.oblig2;

public class Planet {
    private String navn;
    private double radius;
    private double masse;

    public Planet(String navn, double radius, double masse) {
        this.navn = navn;
        this.radius = radius;
        this.masse = masse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn() {this.navn = navn; }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

    public String toString() {
        return("\nNavn: " + navn + ", Radius: " + radius +", Masse: " + masse);
    }
    public double getMasseKg() {
        return(masse*1.898E27);
    }
    public double getKmRadius() {
        return(radius*71492);
    }
    public double getSurfaceGravity() {
        return(( 6.67408E-11 * getMasseKg())/ (getKmRadius()*1000*getKmRadius()*1000));
    }
}
