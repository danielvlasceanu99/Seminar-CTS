package ro.ase.cts.FactoryMethod.classes.factory;

import ro.ase.cts.FactoryMethod.classes.Atacant;
import ro.ase.cts.FactoryMethod.classes.Jucator;

public class FabricaAtacant implements Abstractfactory{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
