package ro.ase.cts.FactoryMethod.program;

import ro.ase.cts.FactoryMethod.classes.Jucator;
import ro.ase.cts.FactoryMethod.classes.factory.*;

public class Main {
    //Metoda asta o consideram modul
    public static void AfiseazaInformatiijucator(Abstractfactory factory, String nume, int nrTricou){
        Jucator jucator = factory.creazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        AfiseazaInformatiijucator(new FabricaProtar(), "Petrica", 12);
        AfiseazaInformatiijucator(new FabricaAtacant(), "Petrica", 12);
        AfiseazaInformatiijucator(new FabricaFundas(), "Petrica", 12);
        AfiseazaInformatiijucator(new FabricaMijlocas(), "Petrica", 12);
    }
}
