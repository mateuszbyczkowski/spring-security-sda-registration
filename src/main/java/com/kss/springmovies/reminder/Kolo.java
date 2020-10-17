package com.kss.springmovies.reminder;

public class Kolo implements Figura {

    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double pole() {
        return Math.PI * r * r;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * r;
    }
}
