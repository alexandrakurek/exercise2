package com.company;


// ZADANIE Z TYPOW WYLICZENIOWYCH - BILETY

import java.util.Scanner;

public class Main {


    public enum Bilet {
        ULGOWY_GODZINNY(1.60d, 10),
        ULGOWY_CALODNIOWY(10.20d, 76),
        NORMALNY_GODZINNY(3.20d, 45),
        NORMALNY_CALODNIOWY(16.20d, 120),
        BRAK_BILETU(340, 65);

        private double cena;
        private int czasJazdy;

        // konstruktor przyjmujacy 2 parametry

        Bilet(double cena, int czasJazdy) {
            this.cena = cena;
            this.czasJazdy = czasJazdy;
        }
// metoda pobierzCeneBiletu
        public double pobierzCene() {
            return this.cena;
        }

// metoda pobierz czas jazdy
        public int pobierzCzasJazdy() {

            return this.czasJazdy;
        }
// metoda wyswietl dane o bilecie
        public void wyswietlDaneOBilecie() {
            System.out.println("Cena biletu wynosi" + cena + "zł" + "czas jazdy:" + czasJazdy + "min");
        }

    }


    public static void main(String[] args) {

        Bilet mojBilet = Bilet.NORMALNY_CALODNIOWY;
        System.out.println(mojBilet.pobierzCene());
        System.out.println(mojBilet.pobierzCzasJazdy());

        mojBilet.wyswietlDaneOBilecie();

        Bilet biletKasi = Bilet.ULGOWY_GODZINNY;
        biletKasi.wyswietlDaneOBilecie();

        Bilet.NORMALNY_GODZINNY.wyswietlDaneOBilecie();


        // ZADANIE 10 slajd 45 - TYPY WYLICZENIOWE

      System.out.println("Czy chcesz kupić bilet ulgowy? tak/nie");
        Scanner scanner = new Scanner(System.in);
        String czyulgowy = scanner.nextLine();


        System.out.println("Podaj czas przejazdu:");
        int czasjazdy = scanner.nextInt();


        switch (czyulgowy) {

            case "tak" :
                System.out.println("Podaj czas przejazdu w min:");
                if(czasjazdy < 60){
                    System.out.println("Należy się bilet ulowy godzinny:" + Bilet.ULGOWY_GODZINNY.pobierzCene());
                }else {
                    System.out.println("Należy się bilet ulgowy całodniowy. Koszt biletu:" + Bilet.ULGOWY_CALODNIOWY.pobierzCene()+ "zł");
                }
                break;
            case "nie":
                System.out.println("Podaj czas przejazdu w min:");
                if (czasjazdy <60){
                    System.out.println("Należy się bilet normalny godzinny:"+ Bilet.NORMALNY_GODZINNY.pobierzCene());
                } else {
                    System.out.println("Należy się bilet normalny całodniowy" + Bilet.NORMALNY_CALODNIOWY.pobierzCene());
                }
                break;
                default:
                    System.out.println("Kara za brak biletu" + Bilet.BRAK_BILETU.pobierzCene());
                    break;

        }
    }
}

