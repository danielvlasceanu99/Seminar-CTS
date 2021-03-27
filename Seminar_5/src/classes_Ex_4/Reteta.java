package classes_Ex_4;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype{
    private List<String> denumireSolutii;
    private List<Integer> cantitati;

    private Reteta() {
        this.denumireSolutii = new ArrayList<>();
        this.cantitati = new ArrayList<>();
    }
    public Reteta(List<String> denumireSolutii, List<Integer> cantitati) {
        this.denumireSolutii = denumireSolutii;
        //realizam validari;
        this.cantitati = cantitati;
    }

    public List<String> getDenumireSolutii() {
        return denumireSolutii;
    }
    public void setDenumireSolutii(List<String> denumireSolutii) {
        this.denumireSolutii = denumireSolutii;
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }
    public void setCantitati(List<Integer> cantitati) {
        //Face validari;
        this.cantitati = cantitati;
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta reteta = new Reteta();
        reteta.denumireSolutii.addAll(this.denumireSolutii);
        reteta.cantitati.addAll(this.cantitati);
        return reteta;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Reteta{");
//        sb.append("denumireSolutii=").append(denumireSolutii);
//        sb.append(", cantitati=").append(cantitati);
//        sb.append('}');
//        return sb.toString();
//    }
}
