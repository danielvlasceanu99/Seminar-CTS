package ro.acs.cts.template.clase;

public abstract class Template {
    public abstract void seAseazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void seFaceControlul();
    public abstract void seOcupaLocul();

    public final void intraPeStadion(){
        this.seAseazaLaCoada();
        this.prezintaBilet();
        this.seFaceControlul();
        this.seOcupaLocul();
    }
}
