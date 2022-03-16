package hiof.januj.oblig4.models;

public class Star extends CelestialBody {
    private double effectiveTemp;

    public Star(String navn, double radius, double masse, double effectiveTemp) {
        super(navn, radius, masse);
        this.effectiveTemp = effectiveTemp;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public String toString() {
        return("Navn:" + getNavn() + ", Radius:" + getRadius() + ", Masse:" + getMasse()) + "\n";
    }


    public double getRadiusKm() {
        return(getRadius()*695700);
    }

    public double getMassKg() {
        return(getMasse()*1.98892E30);
    }

    /*Oppgave 2.1*/
    @Override
    public int compareTo(CelestialBody o) {
        if(this.getRadiusKm() == o.getRadiusKm()) return 0;
        if(this.getRadiusKm() < o.getRadiusKm()) return 1;
        else return -1;
    }

    public String serializer() {
        return this.getNavn() + "," + this.getRadius() + "," + this.getMasse() + "," + this.getEffectiveTemp();
    }
}
