package ro.ase.cts.adapterClase.classes;

public class AdapterLeasing extends Leasing implements Creditable{

    public AdapterLeasing(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void creditare() {
        super.OferaLeasing();
    }
}
