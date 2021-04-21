package ro.ase.cts.state2.classes;

public class Masa {
    private int nrMasa;
    private State stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public State getStare() {
        return stare;
    }

    void setStare(State stare) {
        this.stare = stare;
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata = new StareOcupata();
        stareOcupata.modificaStare(this);
    }

    public void elibereazaMasa(){
        StareLibera stareLibera = new StareLibera();
        stareLibera.modificaStare(this);
    }

    public void rezervareMasa(){
        StareRezervata stareRezervata = new StareRezervata();
        stareRezervata.modificaStare(this);
    }
}
