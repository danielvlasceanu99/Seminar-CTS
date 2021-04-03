package ro.ase.cts.FactoryMethod.classes;

import ro.ase.cts.FactoryMethod.classes.Jucator;

public class Portar extends Jucator {

    public Portar(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
