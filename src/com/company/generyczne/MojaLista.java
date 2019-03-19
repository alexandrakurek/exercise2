package com.company.generyczne;

import static java.lang.reflect.Array.newInstance;

public class MojaLista<E> {

    int liczbaElementow;
    E[] tablica;
    int maxIloscElementow;


    public MojaLista(Class<E> type, int liczbaElementow) {
        this.liczbaElementow = liczbaElementow;
        this.tablica = (E[]) newInstance(type, liczbaElementow); // tablica o nieokreslonych elementach type, liczbaElementow to jest jak int [] tablica = new
    }

    public MojaLista(int maxIloscElementow) {
        this.maxIloscElementow = maxIloscElementow;
    }

    public boolean zawiera(E elementWprowadzony) {
        for (E element : tablica) { // jak nei bedzie dzialalo to w int i=0 itd (miałam E element : tablica)
            if (element.equals(elementWprowadzony)) {
                return true;
            }
        }
        return false;
    }


    public int rozmiar() {
        int licznik =0;
        for (int i = 0; i < tablica.length; i++) { // przechodzimy po pustych elementach po tablicy, kazdy po kolei w dol
            if (tablica[i] != null){ // szukamy gdzie nie ma nulla
                licznik++; // nie ma nulla to dodajemy kolejny
            }

        } return licznik;
    }


    public boolean dodaj(E elementdoDodania) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == null) {
                tablica[i] = elementdoDodania;
            }
        }
        return true;
    }


// this.liczba elemenetow ma zwracac


}
