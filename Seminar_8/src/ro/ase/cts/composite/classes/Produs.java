package ro.ase.cts.composite.classes;

public class Produs implements AbstractComponent{
    private String numeProdus;

    public Produs(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    @Override
    public void prntareElement() {
        System.out.println(this.numeProdus);
    }

    @Override
    public void adaugaElement(AbstractComponent abstractComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeElement(AbstractComponent abstractComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractComponent getElement(int index) {
        throw new UnsupportedOperationException();
    }
}
