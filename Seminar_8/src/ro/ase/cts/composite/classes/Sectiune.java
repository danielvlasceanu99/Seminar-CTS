package ro.ase.cts.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements AbstractComponent{
    private String numeSectiune;
    private List<AbstractComponent> listaComponente = new ArrayList<>();

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void prntareElement() {
        System.out.println("Sectiunea " + this.numeSectiune);
        for (AbstractComponent a:listaComponente) {
            a.prntareElement();
        }
    }

    @Override
    public void adaugaElement(AbstractComponent abstractComponent) {
        if (abstractComponent != null){
            listaComponente.add(abstractComponent);
        }
    }

    @Override
    public void stergeElement(AbstractComponent abstractComponent) {
        if (abstractComponent != null){
            listaComponente.add(abstractComponent);
        }
    }

    @Override
    public AbstractComponent getElement(int index) {
        if(index >= 0 && index < listaComponente.size()){
            return listaComponente.get(index);
        }
        throw new IndexOutOfBoundsException();
    }
}
