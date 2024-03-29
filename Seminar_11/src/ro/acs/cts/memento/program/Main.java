package ro.acs.cts.memento.program;

import ro.acs.cts.memento.clase.ManagerMemento;
import ro.acs.cts.memento.clase.Meci;

public class Main {
    public static void main(String[] args) {
        ManagerMemento manager = new ManagerMemento();

        Meci meci1 = new Meci("Steaua", "Dinamo", 102, 100, 12);
        manager.adaugaMemento(meci1.creareMemento());

        meci1.setEchipaGazda("Rapid");
        meci1.setNrSpectatori(152);
        manager.adaugaMemento(meci1.creareMemento());

        System.out.println(meci1.toString());

        System.out.println("=================================");

        meci1.setMemento(manager.getMemento(0));
        System.out.println(meci1.toString());

        System.out.println("=================================");
        meci1.setMemento(manager.getLastMemento());
        System.out.println(meci1.toString());

    }
}
