package com.company.generyczne;

public class Trener <T extends Sportowiec> { // musi być w <> extends bo bysmy nie widzieli metody trenuj w prowadzTrening


    public void  prowadzTrening (T sportowiecDoWytrenowania){
        sportowiecDoWytrenowania.trenuj();

    }

}
