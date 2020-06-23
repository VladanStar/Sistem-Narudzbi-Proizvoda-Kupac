package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Kupac kupac = new Kupac("Marko", "Markovic", "marko@gmail.com");

        Proizvod p1 = new Proizvod("Laptop", 50000);
        Proizvod p2 = new Proizvod("Slusalice", 7500);
        Proizvod p3 = new Proizvod("Mis", 5000);
        Proizvod p4 = new Proizvod("Tastatura", 6300);

        Porudzbina porudzbina = new Porudzbina();

        porudzbina.dodajStavku(new Stavka(p1, 2));
        porudzbina.dodajStavku(new Stavka(p2, 3));
        porudzbina.dodajStavku(new Stavka(p3, 1));

        porudzbina.pregledPorudzbine();
    }

}


