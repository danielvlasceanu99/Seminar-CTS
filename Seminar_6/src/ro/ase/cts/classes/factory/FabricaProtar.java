package ro.ase.cts.classes.factory;

import ro.ase.cts.classes.Jucator;
import ro.ase.cts.classes.Portar;

public class FabricaProtar implements Abstractfactory{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }
}
