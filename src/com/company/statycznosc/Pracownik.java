package com.company.statycznosc;

public class Pracownik {
    // metoda wejdz do biura, wyjdz z biura, beda zmieniac liczbe osoba wewnatrz biura


        private String name;
        private boolean czyWBiurze;

    public Pracownik(boolean czyWBiurze, String name) {
            this.czyWBiurze = czyWBiurze;
            this.name = name;
        }

        public void wejdzDoBiura() {
            if(!czyWBiurze) {
                Biuro.iloscOsobWewnatrz++;
                System.out.println("Ilosc osob w biurze: "+ Biuro.iloscOsobWewnatrz);
                czyWBiurze = !czyWBiurze;
            }else {
                System.out.println(this.name+ " " + "nie mozesz wejsc, jak juz jestes w srodku");
            }
        }
    public void wyjdzZBiura() {
        if(czyWBiurze) {
            if(Biuro.iloscOsobWewnatrz>0) {
                Biuro.iloscOsobWewnatrz--;
                System.out.println("Ilosc osob w biurze: "+ Biuro.iloscOsobWewnatrz);
                czyWBiurze = !czyWBiurze;
            }
        }else {
            System.out.println(this.name + "nie mozesz wyjsc, jak juz jestes na zewnatrz");
        }
    }
}

















