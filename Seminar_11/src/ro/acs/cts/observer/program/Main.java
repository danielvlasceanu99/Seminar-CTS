package ro.acs.cts.observer.program;

import ro.acs.cts.observer.clase.ClientAbonat;
import ro.acs.cts.observer.clase.ManagerSala;
import ro.acs.cts.observer.clase.Observator;

public class Main {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Sala aia");

        managerSala.adaugaAbonat(new ClientAbonat("Petrica"));
        managerSala.adaugaAbonat(new ClientAbonat("Gigel"));
        managerSala.adaugaAbonat(new ClientAbonat("Gogu"));
        managerSala.adaugaAbonat(new ClientAbonat("Marcel"));
        Observator client = new ClientAbonat("Ion");
        managerSala.adaugaAbonat(client);

        managerSala.anuntaMeci("Fotbal");

        managerSala.stergeAbonat(client);

        managerSala.anuntaMeci("Basket");
    }
}
