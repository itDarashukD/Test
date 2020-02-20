package com.company.avtomobile;

public class Bus {
    public double pyt;
    private double bak;
    private double rashod;
    private int godVupuska;
    public int busOld;
    public int year = 2020;

    public Bus(String name, double bak, double rashod, int godVupuska) {
        this.name = name;
        this.bak = bak;
        this.rashod = rashod;
        this.godVupuska = godVupuska;
    }

    public int getBusOld() {
        return busOld;
    }

    public void setBusOld(int busOld) {
        this.busOld = busOld;
    }

    public int getGodVupuska() {
        return godVupuska;
    }

    public void setGodVupuska(int godVupuska) {
        this.godVupuska = godVupuska;
    }

    public double getPyt() {
        return pyt;
    }

    public void setPyt(double pyt) {
        this.pyt = pyt;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBak() {
        return bak;
    }

    public void setBak(double bak) {
        this.bak = bak;
    }

    public double getRashod() {
        return rashod;
    }

    public void setRashod(double rashod) {
        this.rashod = rashod;
    }

    //Сколько проедет при полном баке
    public double vuchislenie(Bus bus) {
        pyt = (getBak() / getRashod()) * 100;
        System.out.println(pyt);
        return pyt;
    }

    public void vuchislenieVozrasta(Bus bus) {
        busOld = year - getGodVupuska();
        System.out.println("Бусу сейчас " + busOld + " лет");

    }
}
