package com.company.generyczne.sklep;

public class Sklep {
    public static void main (String []arg){
        KoszNaOwoce <Owoc> koszNaOwoce = new KoszNaOwoce<>(Owoc.class, 2 );


        Jablko jablko1 = new Jablko("czerwone");
        Winogrono winogrono1 = new Winogrono("zielone");

        koszNaOwoce.dodajOwoc(jablko1);
        System.out.println(koszNaOwoce);








    }
}
