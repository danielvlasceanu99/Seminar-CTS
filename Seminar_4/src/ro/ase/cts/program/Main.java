package ro.ase.cts.program;

import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;

public class Main {
    public static void main(String[] args) {
//        Parlament parlament1 = new Parlament("Romania", 123, 4, "Undeva");
//        Parlament parlament2 = new Parlament("Bulgaria", 456, 14, "In Bulgaria");

        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();

        System.out.println("Igger initialization");
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());


        parlament2.setNrParlamentari(123);
        parlament1.setTara("Romania");

        System.out.println("\nIgger initialization after setter call");
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());


        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Romania", 300, 4, "Sediul nostru");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("Serbia", 123, 5, "Sediul Serbiei");

        System.out.println("\nLazy initialization initialization after setter call");
        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());
    }
}
