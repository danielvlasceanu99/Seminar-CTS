package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.classes.Client;
import ro.ase.cts.strategy.classes.PayCard;
import ro.ase.cts.strategy.classes.PayCash;
import ro.ase.cts.strategy.classes.PayDogecoin;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Gigel", new PayCash());
        client.platesteNota(200);

        client.setPayable(new PayCard());
        client.platesteNota(12);

        client.setPayable(new PayDogecoin());
        client.platesteNota(12345);
    }
}
