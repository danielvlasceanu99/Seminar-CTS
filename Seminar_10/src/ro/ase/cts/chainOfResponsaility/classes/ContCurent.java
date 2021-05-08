package ro.ase.cts.chainOfResponsaility.classes;

public class ContCurent extends Cont{

    public ContCurent(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(super.getSold() >= suma){
            System.out.println("s-a realizat plata in valoare de " + suma + " din contul curent");
            super.setSold(super.getSold() - suma);
        }
        else if(super.getContSuccesor() != null){
            super.getContSuccesor().realizeazaPlata(suma);
        }
        else{
            System.out.println("Nu se poate realiza plata");
        }
    }
}
