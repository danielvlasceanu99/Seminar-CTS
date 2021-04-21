package ro.ase.cts.proxy.classes;

public class ProxyManager implements Rezervabil{

    private ManagerRezervari managerRezervari;
    private int nrMinPersoane;

    public ProxyManager(ManagerRezervari managerRezervari, int nrMinPersoane) {
        this.managerRezervari = managerRezervari;
        this.nrMinPersoane = nrMinPersoane;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if (nrPersoane >= this.nrMinPersoane){
            managerRezervari.rezerva(nrPersoane);
        }
        else{
            System.out.println("Rezervarea se poate realiza, veniti fara rezervare.");
        }
    }
}
