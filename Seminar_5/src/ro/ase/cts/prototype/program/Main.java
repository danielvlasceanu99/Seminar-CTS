package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.classes.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> solutii = new ArrayList<>();
        solutii.add("Apa");
        List<Integer> cantitati = new ArrayList<>();
        cantitati.add(12);

        Reteta reteta = new Reteta(solutii, cantitati);

        Reteta reteta1 = (Reteta) reteta.copiaza();

        System.out.println(reteta);
        System.out.println(reteta1);
    }
}
