package ro.ase.cts.clase;

public class Videoclip {
    private String denumire;
    private float durataMin;
    private int dimensiune;

    private static Videoclip videoclip = null;

    public static synchronized Videoclip getInstance(String denumire, float durataMin, int dimensiune){
        if(Videoclip.videoclip == null){
            Videoclip.videoclip = new Videoclip(denumire, durataMin, dimensiune);
        }
        return Videoclip.videoclip;
    }

    private Videoclip() {
        this.denumire = "";
        this.durataMin = 0;
        this.dimensiune = 0;
    }
    private Videoclip(String denumire, float durataMin, int dimensiune) {
        this.denumire = denumire;
        this.durataMin = durataMin;
        this.dimensiune = dimensiune;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setDurataMin(float durataMin) {
        this.durataMin = durataMin;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Videoclip{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", durataMin=").append(durataMin);
        sb.append(", dimensiune=").append(dimensiune);
        sb.append('}');
        return sb.toString();
    }


}
