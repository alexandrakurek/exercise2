package com.company.statycznosc;

public class Main {
    public static void main (String[]arg){
        Pracownik pracownik1 = new Pracownik(true,"Robert");
        Pracownik pracownik2 = new Pracownik(false,"Kasia");




        pracownik2.wejdzDoBiura();
        pracownik1.wejdzDoBiura();
        pracownik1.wyjdzZBiura();



    }
}
