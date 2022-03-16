package hiof.januj.oblig4.models;

import java.util.Comparator;

/* 2.1 */
public abstract class CelestialBody implements Comparable<CelestialBody> {
    private String navn;
    private double radius;
    private double masse;

    public CelestialBody(String navn, double radius, double masse) {
    this.navn = navn;
    this.radius = radius;
    this.masse = masse;

    }

    public abstract double getRadiusKm();
    public abstract double getMassKg();


    public String toString() {
        return("\nNavn: " + navn + ", Radius: " + radius +", Masse: " + masse);
    }


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

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


}

