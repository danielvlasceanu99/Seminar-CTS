package ro.ase.cts.facade.classes;

public class Facade {
    public static boolean esteMasaPregatita(Masa masa){
        if(OperatorMese.esteLibera(masa.getNrMasa())){
            Picolo picolo = new Picolo("Gigel");
            if(picolo.esteDebarasata(masa.getNrMasa())){
                if(picolo.esteAranjata(masa.getNrMasa())){
                    return true;
                }
            }
        }
        return false;
    }
}
