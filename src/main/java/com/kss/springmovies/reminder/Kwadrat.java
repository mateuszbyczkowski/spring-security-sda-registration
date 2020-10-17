package com.kss.springmovies.reminder;

public class Kwadrat implements Figura {

    private double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double pole() {
        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obwod() {
        return 4 * dlugoscBoku;
    }
}
