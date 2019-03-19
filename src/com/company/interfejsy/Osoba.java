package com.company.interfejsy;
public class Osoba implements PosiadaAdres, PosiadaImie {
    public String imie;
    public String nazwisko;
    public Adres adres;

    public Osoba(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    @Override
    public Adres getAdres(){
        return this.adres;

    }
    @Override
    public String getImie(){
        return this.imie;
    }





}
