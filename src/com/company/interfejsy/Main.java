package com.company.interfejsy;

public class Main {
    public static void main(String[] arg) {

        Adres adres1 = new Adres("Nowicka", 4, "Gdansk");
        Adres adres2 = new Adres("Nowowiejska", 6, "Gdynia");
        Adres adres3 = new Adres("Tylicka", 7, "Gdańsk");
        Adres adres4 = new Adres("Sopocka", 3, "Gdańsk");

        Osoba osoba1 = new Osoba("Kasia", "Kot", adres1);
        Osoba osoba2 = new Osoba("Tomek", "Kowalski", adres2);

        Firma firma1 = new Firma("Hestia", adres3);
        Firma firma2 = new Firma("Tomi", adres4);


    }

    // public static void


}





