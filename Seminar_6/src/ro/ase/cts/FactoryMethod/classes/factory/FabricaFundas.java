package ro.ase.cts.FactoryMethod.classes.factory;

import ro.ase.cts.FactoryMethod.classes.Fundas;
import ro.ase.cts.FactoryMethod.classes.Jucator;

public class FabricaFundas implements Abstractfactory{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Fundas(nume, nrTricou);
    }
}
