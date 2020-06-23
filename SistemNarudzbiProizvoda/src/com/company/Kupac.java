package com.company;

import java.util.ArrayList;
import java.util.List;

public class Kupac {
    private String ime;
    private String prezime;
    private String email;
    private List<Porudzbina> porudzbine = new ArrayList<>();

    public Kupac() {
    }

    public Kupac(String ime, String prezime, String email, List<Porudzbina> porudzbine) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.porudzbine = porudzbine;
    }

    public Kupac(String marko, String markovic, String s) {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Porudzbina> getPorudzbine() {
        return porudzbine;
    }

    public void setPorudzbine(List<Porudzbina> porudzbine) {
        this.porudzbine = porudzbine;
    }
}
