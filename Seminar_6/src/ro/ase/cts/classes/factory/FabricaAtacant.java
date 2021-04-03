package ro.ase.cts.classes.factory;

import ro.ase.cts.classes.Atacant;
import ro.ase.cts.classes.Jucator;

public class FabricaAtacant implements Abstractfactory{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
