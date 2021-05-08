package ro.ase.cts.chainOfResponsaility.program;

import ro.ase.cts.chainOfResponsaility.classes.Cont;
import ro.ase.cts.chainOfResponsaility.classes.ContCredit;
import ro.ase.cts.chainOfResponsaility.classes.ContCurent;
import ro.ase.cts.chainOfResponsaility.classes.ContEconomi;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contEconomi = new ContEconomi(150);
        Cont contCredit = new ContCredit(150);

        contCurent.setContSuccesor(contEconomi);
        contEconomi.setContSuccesor(contCredit);

        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(150);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
    }
}
