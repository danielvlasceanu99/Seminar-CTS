package ro.ase.cts.classes.factory;

import ro.ase.cts.classes.Jucator;
import ro.ase.cts.classes.Mijlocas;

public class FabricaMijlocas implements Abstractfactory{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
