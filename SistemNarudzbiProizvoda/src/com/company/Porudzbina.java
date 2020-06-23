package com.company;

import java.util.ArrayList;
import java.util.List;

public class Porudzbina {
    private List<Stavka> stavke = new ArrayList<>();
    private  Kupac kupac;

    public Porudzbina() {
    }

    public Porudzbina(List<Stavka> stavke, Kupac kupac) {
        this.stavke = stavke;
        this.kupac = kupac;
    }

    public List<Stavka> getStavke() {
        return stavke;
    }

    public void setStavke(List<Stavka> stavke) {
        this.stavke = stavke;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }
    public void dodajPorudzbinu(Stavka stavka){
        stavke.add(stavka);
    }
    public double cenaPorudzbine() {
        double ukupnaCena = 0;
        for (Stavka s : stavke) {
            ukupnaCena += s.getProizod().getCena() * s.getKolicina();
        }
        return ukupnaCena;
    }

    public void pregledPorudzbine() {
        for (Stavka s : stavke) {
            System.out.println(s.getProizod().getNaziv() + " " + s.getKolicina() + " = " + s.getProizod().getCena() * s.getKolicina());
        }
        System.out.println("____________________________________________________________");
        System.out.println("UKUPNO: " + cenaPorudzbine());
    }

    public void dodajStavku(Stavka stavka) {
        this.stavke.add(stavka);
    }
}
