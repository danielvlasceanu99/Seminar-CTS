package ro.acs.cts.template.clase;

public class SpectatorNormal extends Template{
    private String nume;

    public SpectatorNormal(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAseazaLaCoada() {
        System.out.println(this.nume + " se aseza la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume + " prezinta bilet");
    }

    @Override
    public void seFaceControlul() {
        System.out.println(this.nume + " este contolat");
    }

    @Override
    public void seOcupaLocul() {
        System.out.println(this.nume + " ocupa locul la tribuna");
    }
}
