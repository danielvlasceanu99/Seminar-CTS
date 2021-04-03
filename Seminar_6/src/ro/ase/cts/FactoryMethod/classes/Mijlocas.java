package ro.ase.cts.FactoryMethod.classes;

import ro.ase.cts.FactoryMethod.classes.Jucator;

public class Mijlocas extends Jucator {
    public Mijlocas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
