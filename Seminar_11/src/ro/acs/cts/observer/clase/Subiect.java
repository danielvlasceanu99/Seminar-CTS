package ro.acs.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observator> abonati;

    public Subiect(){
        this.abonati = new ArrayList<>();
    }

    public void adaugaAbonat(Observator client){
        if(client != null){
            this.abonati.add(client);
        }
    }
    public void stergeAbonat(Observator client){
        if(client != null){
            this.abonati.remove(client);
        }
    }
    public void trimiteNotoficare(String mesaj){
        for (Observator observator: abonati) {
            observator.receptionareMesaj(mesaj);
        }
    }
}
