package com.company.dziedziczenie;

public class Samochod {
    public static void main(String[] args) {
        // przyspiesz (): void zwieksza predkosc auta o 10km/h
        // auto nie moze jechac wiecej niz 120 km/h
        // wyswietl "przyspieszam do xxx km/h
        // wlaczSwiatla():void
        // czySwiatlaWlaczone(): boolean


        Samochod auto1 = new Samochod(100);
        auto1.przyspiesz();
        auto1.wlaczSwiatla();
        System.out.println(auto1.hashCode());// dostaniemy jakies cyfry ktore pozniej zostana wyjasnione, metoda powiazana z equals
        auto1.czywlaczycSwiatla(false);

        Kabriolet auto2 = new Kabriolet("zielony", "Ford", 2000);
        auto2.schowajDach();
        auto2.czySchowacDach(false);
        Kabriolet auto3 = new Kabriolet("czarny", "Skoda", 2003);
        auto3.czySchowacDach(true);

        auto3.przyspiesz();

        Samochod auto6 = new Samochod("bordowy", "Opel", 2016);
        System.out.println(auto6.toString());

        Kabriolet kabriolet = new Kabriolet("czerwony", "Porshe", 2017);
        System.out.println(kabriolet.toString());

        System.out.println(auto1.equals(auto2));


    }

    public int predkosc;
    public String kolor;
    public String marka;
    public int rocznik;

    // konstruktor
    public Samochod(int predkosc) {
        this.predkosc = predkosc;
    }

    public Samochod(String kolor, String marka, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }


    public void przyspiesz() {
        for (int i = this.predkosc; i <= 120; i += 10) {
            System.out.println("Przyspieszam do" + i + "km/h");
        }
    }

    public void wlaczSwiatla() {
        System.out.println("Wlaczam swiatla");
    }


    public void czywlaczycSwiatla(boolean swiatla) {

        if (swiatla == true) {
            System.out.println("swiatla wlaczone");
        } else {
            System.out.println("swiatla wylaczone");
        }
    }
    //Nadpisz metodę ’toString()’ klasy Samochod,
    //tak aby wyświetlała opis „{kolor} samochód marki {marka} rocznik
    //{rocznik}”

    public String toString() {
        return "Samochod " + "kolor:" + this.kolor + "samochód marki" + this.marka + this.rocznik;

    }

    public boolean equals(Samochod samochod) {
        if (this == samochod) ;
        return (this == samochod);

    }
}




















