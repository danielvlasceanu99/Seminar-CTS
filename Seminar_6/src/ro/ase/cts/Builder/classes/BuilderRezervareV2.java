package ro.ase.cts.Builder.classes;

public class BuilderRezervareV2 implements AbstractBuilder{
    private int codrezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzical;

    @Override
    public Rezervare build() {
        return new Rezervare(this.codrezervare, this.areMancareInclusa, this.areScaunErgonomic,
                this.areBauturaRacoritoareInclusa, this.areMuzicaAmbientalaPersonalizata, this.genMuzical);
    }

    public BuilderRezervareV2() {
        codrezervare=1000;
        genMuzical="Nimic";
    }

    public BuilderRezervareV2 setCodrezervare(int codrezervare) {
        this.codrezervare = codrezervare;
        return this;
    }

    public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervareV2 setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        return this;
    }

    public BuilderRezervareV2 setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }
}
