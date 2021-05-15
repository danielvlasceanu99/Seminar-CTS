package ro.acs.cts.observer.clase;

public class ClientAbonat implements Observator{
    private String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(this.nume + " a receptionat mesajul: " + mesaj);
    }
}
