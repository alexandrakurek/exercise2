package com.company.generyczne;

public class Trening {
    public static void main (String[] arg){
        Pilkarz lewandowski = new Pilkarz();


        Trener<Sportowiec> leoBenhaker = new Trener<>();
        leoBenhaker.prowadzTrening(lewandowski);

    }
}
