package com.company.interfejsy;

public class Adres {
    public String ulica;
    public int nrdomu;
    public String miasto;

    public Adres(String ulica, int nrdomu, String miasto) {
        this.ulica = ulica;
        this.nrdomu = nrdomu;
        this.miasto = miasto;
    }

    public boolean czyGdanskiAdres() {
        if (this.miasto.equals("Gdańsk")) {
            return true;
        } else {
            return false;
        }
    }




}
