package com.company.generyczne.samochody;

public class Samochod {
    private String marka;
    private String model;
    private String kolor;


    public Samochod(String marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }


    public void zmienKolor(String kolorDoZmiany) {
        kolor = kolorDoZmiany;
    }

    @Override
    public String toString() {
        return marka + "; " + model + "; " + kolor;
    }


    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getKolor() {
        return kolor;
    }
}


