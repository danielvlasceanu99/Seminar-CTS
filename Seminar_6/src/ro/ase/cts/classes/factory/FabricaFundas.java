package ro.ase.cts.classes.factory;

import ro.ase.cts.classes.Fundas;
import ro.ase.cts.classes.Jucator;

public class FabricaFundas implements Abstractfactory{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Fundas(nume, nrTricou);
    }
}
