package com.company.interfejsy;

public class Firma implements PosiadaAdres,PosiadaNazwe {
    public String nazwa;
    public Adres adres;

    public Firma(String nazwa, Adres adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }
    @Override
    public Adres getAdres(){
        return this.adres;

    }
    @Override
    public String getNazwa(){
        return this.nazwa;
    }



}
