package com.company.dziedziczenie;


import com.company.statycznosc.Biuro;

class Kabriolet extends Samochod {


    // musimy utworzyc pusty konstruktor, bo nie moze nam dziedziczyc tego z klasy samochod
    public Kabriolet(String kolor, String marka, int rocznik) {
        super (kolor,marka,rocznik);//odziedziczyl z klasy samochod // ten drugi konstruktor
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;

    }






    public void schowajDach() {
        System.out.println("Chowam dach");
    }


    @Override
    public void przyspiesz() {
        for (int i = this.predkosc; i <= 180; i += 10) {
            System.out.println("Przyspieszam do" + i + "km/h");
        }
    }


    public void czySchowacDach(boolean dach) {
        if (dach == true) {
            System.out.println("Otwieram dach");
        } else
            System.out.println("Chowam dach");

    }
    @Override
    public String toString(){
        return "Samochod marki" + this.marka + "kolor" + this.kolor + "z rozsuwanym dachem";
    }




   // @Override
    //public boolean equals(Object object) {
      //  if (this == object) {
        //}return true;
    //}
}

















