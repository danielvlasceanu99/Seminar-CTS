package ro.ase.cts.facade.program;

import ro.ase.cts.facade.classes.Facade;
import ro.ase.cts.facade.classes.Masa;
//import ro.ase.cts.facade.classes.OperatorMese;
//import ro.ase.cts.facade.classes.Picolo;

public class Main {
    public static void main(String[] args) {

//        Complexitatea ascunsa de Facade
//        Masa masa1 = new Masa(30, 5);
//        if(OperatorMese.esteLibera(masa1.getNrMasa())){
//            Picolo picolo = new Picolo("Gigel");
//            if(picolo.esteDebarasata(masa1.getNrMasa())){
//                if(picolo.esteAranjata(masa1.getNrMasa())){
//                    System.out.println("Masa poate fi ocupata pe client");
//                }
//                else{
//                    System.out.println("Masa nu este aranjata");
//                }
//            }
//            else{
//                System.out.println("Masa nu este debarasata");
//            }
//        }
//        else {
//            System.out.println("Masa nu este libera");
//        }

        Masa masa = new Masa(30, 5);
        if (Facade.esteMasaPregatita(masa)){
            System.out.println("Masa poate fi ocupata pe client");
        }else{
            System.out.println("Mai asteptati");
        }
    }
}
