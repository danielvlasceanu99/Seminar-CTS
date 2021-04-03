package ro.ase.cts.FactoryMethod.classes.factory;

import ro.ase.cts.FactoryMethod.classes.Jucator;
import ro.ase.cts.FactoryMethod.classes.Portar;

public class FabricaProtar implements Abstractfactory{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }
}
