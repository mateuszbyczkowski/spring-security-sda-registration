package com.kss.springmovies.reminder;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Figura kolo = new Kolo(4);
        Figura kolo1 = new Kolo(4.5);

        Figura kwadrat = new Kwadrat(5);
        Figura kwadrat1 = new Kwadrat(3.45);

        List<Figura> figury = Arrays.asList(kolo, kolo1, kwadrat, kwadrat1);
        List<Figura> figury2 = new ArrayList<>();
        List<Figura> figury3 = new LinkedList<>();

        Map<Integer, Figura> figuraMap = new TreeMap<>();
        Map<Integer, Figura> figuraMap2 = new HashMap<>();

        for (Figura figura : figury) {
            System.out.println("Obwód: " + figura.obwod());
            System.out.println("Pole: " + figura.pole());
        }
    }
}
