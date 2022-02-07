package hiof.januj.oblig2;

public class Star extends Planet {
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
    public double getSunRadiusKm() {
        return(getRadius()*1.98892E30);
    }
    public double getSunMassKg() {
        return(getMasse()*695700);
    }
}
