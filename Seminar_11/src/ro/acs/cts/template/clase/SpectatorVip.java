package ro.acs.cts.template.clase;

public class SpectatorVip extends Template{
    private String nume;
    private int nrLoja;

    public SpectatorVip(String nume, int nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }

    @Override
    public void seAseazaLaCoada() {

    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume + " prezinta bilet VIP pentru loja " + this.nrLoja);
    }

    @Override
    public void seFaceControlul() {
        System.out.println(this.nume + " este controlat");
    }

    @Override
    public void seOcupaLocul() {
        System.out.println(this.nume + " se aseaza in loja " + this.nrLoja);
    }
}
