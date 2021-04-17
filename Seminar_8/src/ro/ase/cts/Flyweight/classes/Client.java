package ro.ase.cts.Flyweight.classes;

public class Client implements FlyweightAbstract{
    private String numeClient;
    private String nrTelefon;
    private String email;

    public Client(String numeClient, String nrTelefon, String email) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printezaRezervare(Rezervare rezervare) {
        System.out.println(this.toString() + rezervare.toString());
    }
}
