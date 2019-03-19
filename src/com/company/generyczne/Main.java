package com.company.generyczne;

import com.company.generyczne.samochody.BMW;
import com.company.generyczne.samochody.Garaz;
import com.company.generyczne.samochody.Samochod;

public class Main {

    public static void main(String[] arg) {

        Garaz<Samochod> garazNaSamochody = new Garaz<>();
        BMW x6 = new BMW("X6", "czarne");
        BMW x5 = new BMW ("X5", "niebieski");
        Samochod maluch = new Samochod("fiat", "126p", "rdzawy");
        garazNaSamochody.zaparkujAuto(x6);
        garazNaSamochody.zaparkujAuto(maluch);

        MojaLista<BMW> mojaLista = new MojaLista<BMW>(BMW.class, 4);

        mojaLista.rozmiar();





    }



}



