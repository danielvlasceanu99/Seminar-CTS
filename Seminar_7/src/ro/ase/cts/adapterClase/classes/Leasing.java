package ro.ase.cts.adapterClase.classes;

public class Leasing {
    private String numeClient;
    private int suma;

    public Leasing(String numeClient, int suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    public void OferaLeasing(){
        System.out.println("Pentru clientul " + this.numeClient + " a fost oferit un leasing de " + this.suma + " euro.");
    }
}
