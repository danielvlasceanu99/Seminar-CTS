package ro.ase.cts.Flyweight.program;

import ro.ase.cts.Flyweight.classes.Flyweightfactory;
import ro.ase.cts.Flyweight.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, 1);
        Rezervare rezervare2 = new Rezervare(2, 1);
        Rezervare rezervare3 = new Rezervare(3, 1);

        Flyweightfactory flyweightfactory = new Flyweightfactory();

        flyweightfactory.getClient("123456").printezaRezervare(rezervare1);
        flyweightfactory.getClient("987654").printezaRezervare(rezervare2);
        flyweightfactory.getClient("123456").printezaRezervare(rezervare3);
    }
}
