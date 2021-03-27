package ro.ase.cts.factory.program;

import ro.ase.cts.factory.classes.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalMedical medic = factory.create(TipPersonal.MEDIC, "Gigel medic", 10000);
        PersonalMedical asistent = factory.create(TipPersonal.ASISTENT, "Gigel asistent", 10000);
        PersonalMedical brancardier = factory.create(TipPersonal.BRANCARDIER, "Gigel brancardier", 10000);

        System.out.println(medic);
        System.out.println(asistent);
        System.out.println(brancardier);
    }
}
