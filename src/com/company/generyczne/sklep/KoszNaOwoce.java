package com.company.generyczne.sklep;

import static java.lang.reflect.Array.newInstance;

public class KoszNaOwoce<E extends Owoc> {
    public int rozmiarKosza;
    E[] kosz;

    // przechowującą tablicę owoców o określonym rozmiarze kosza
    public KoszNaOwoce(Class<E> type, int rozmiarKosza) {
        this.rozmiarKosza = rozmiarKosza;
        this.kosz = (E[]) newInstance(type, rozmiarKosza);
    }


    public boolean dodajOwoc(E owodDoDodania) {
        for (int i = 0; i < kosz.length; i++) {
            if (kosz[i] == null) {
                kosz[i] = owodDoDodania;
            }
        }
        return true;
    }

    public boolean usunOwoc(E owocDoUsuniecia) {
        for (int i = 0; i < kosz.length; i--) {
            if (kosz[i].equals(owocDoUsuniecia)) {
                kosz[i] = null;
                return true;
            }

        } return false;

    }
}












