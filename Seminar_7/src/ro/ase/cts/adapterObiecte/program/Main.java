package ro.ase.cts.adapterObiecte.program;

import ro.ase.cts.adapterObiecte.classes.AdapterLeasing;
import ro.ase.cts.adapterObiecte.classes.Creditable;
import ro.ase.cts.adapterObiecte.classes.Leasing;

public class Main {
    public  static void printeazaInfoCredite(Creditable credit){
        credit.creditare();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Petrica", 1234);
        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.creditare();
        System.out.println("=================================================================");
        printeazaInfoCredite(adapterLeasing);
    }
}
