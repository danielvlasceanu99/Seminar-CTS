package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.classes.BuilderRezervare;
import ro.ase.cts.Builder.classes.BuilderRezervareV2;
import ro.ase.cts.Builder.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(12, false, true, false,
                true, "rock");

        BuilderRezervare builderRezervare = new BuilderRezervare().setCodrezervare(1)
                .setAreMancareInclusa(true)
                .setAreMuzicaAmbientalaPersonalizata(true).setGenMuzical("Rock");
        Rezervare rezervare1 = builderRezervare.build();

        Rezervare rezervare2 = new BuilderRezervare().setCodrezervare(2)
                .setArebauturaRacoritoareInclusa(true).build();

        Rezervare rezervare3 = builderRezervare.setCodrezervare(3).build();

        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2()
                .setAreMancareInclusa(true)
                .setAreBauturaRacoritoareInclusa(true);

        Rezervare r1 = builderRezervareV2.setCodrezervare(123).build();
        Rezervare r2 = builderRezervareV2.setCodrezervare(124).build();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());

    }


}
