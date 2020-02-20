package com.company.avtomobile;

public class Golf {
    private double put;
    private String name;
    private double bak;
    private double rashod;
    private int ggodVupuska;
    private int gOld;
    public int year = 2020;

    public Golf(String name, double bak, double rashod,int ggodVupuska) {
        this.name = name;
        this.bak = bak;
        this.rashod = rashod;
        this.ggodVupuska = ggodVupuska;

    }

    public int getgOld() {
        return gOld;
    }

    public void setgOld(int gOld) {
        this.gOld = gOld;
    }

    public int getGgodVupuska() {
        return ggodVupuska;
    }

    public void setGgodVupuska(int ggodVupuska) {
        this.ggodVupuska = ggodVupuska;
    }

    public double getPut() {
        return put;
    }

    public void setPut(double put) {
        this.put = put;
    }


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
    public double vuchislenie(Golf golf) {

        put = (getBak() / getRashod()) * 100;
        System.out.println(put);

        return put;
    }


    public boolean sravnenie(Golf first, Bus second) {
        return (put > second.getPyt());

    }
   
    public int vuchislenieVozrasta(Golf golf) { gOld=year - getGgodVupuska();
        System.out.println("Гольфу сейчас "+gOld+" лет");
        return gOld;
    };

    public boolean sravnenieVozrasta(Golf first, Bus second) {
        return (getgOld()>second.getBusOld());
    }

}