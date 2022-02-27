package hiof.januj.oblig3.models;

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
        return("\nNavn:" + getNavn() + "\nRadius:" + getRadius() + "\nMasse:" + getMasse());
    }

}
