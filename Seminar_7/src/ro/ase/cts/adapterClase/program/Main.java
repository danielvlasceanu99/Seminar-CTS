package ro.ase.cts.adapterClase.program;

import ro.ase.cts.adapterClase.classes.AdapterLeasing;
import ro.ase.cts.adapterClase.classes.Creditable;

public class Main {
    public  static void printeazaInfoCredite(Creditable credit){
        credit.creditare();
    }

    public static void main(String[] args) {
        AdapterLeasing adapterLeasing = new AdapterLeasing("Gigel", 123456);
        printeazaInfoCredite(adapterLeasing);
    }
}
