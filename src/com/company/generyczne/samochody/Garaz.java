package com.company.generyczne.samochody;

public class Garaz<T extends Samochod> {
    private T miejsceParkingowe1;
    private T miejsceParkingowe2;

    public Garaz() {
    }

    public Garaz(T miejsceParkingowe1, T miejsceParkingowe2) {
        this.miejsceParkingowe1 = miejsceParkingowe1;
        this.miejsceParkingowe2 = miejsceParkingowe2;
    }

    public void zaparkujAuto(T doZaparkownia) {
        miejsceParkingowe1 = doZaparkownia;
    }

    public T wyprowadzaAuto() {
        return miejsceParkingowe1;
    }


    public T getMiejsceParkingowe1() {
        return miejsceParkingowe1;
    }

    public T getMiejsceParkingowe2() {
        return miejsceParkingowe2;
    }
}

