package ro.ase.cts.strategy.classes;

public class Client {
    private String nume;
    private Payable payable;

    public Client(String nume, Payable payable) {
        this.nume = nume;
        this.payable = payable;
    }

    public void setPayable(Payable payable) {
        this.payable = payable;
    }

    public void platesteNota(float suma){
        System.out.println("Clientul " + this.nume + " are de realizat o plata");
        this.payable.pay(suma);
    }
}
