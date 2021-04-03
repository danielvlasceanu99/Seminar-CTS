package ro.ase.cts.FactoryMethod.classes.factory;

import ro.ase.cts.FactoryMethod.classes.Jucator;
import ro.ase.cts.FactoryMethod.classes.Mijlocas;

public class FabricaMijlocas implements Abstractfactory{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
