package com.company;

public class Stavka {
    private Proizvod proizvod;
    private int kolicina;

    public Stavka() {
    }

    public Stavka(Proizvod proizvod, int kolicina) {
        this.proizvod = proizvod;
        this.kolicina = kolicina;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Proizvod getProizod() {
        return proizvod;
    }
}
