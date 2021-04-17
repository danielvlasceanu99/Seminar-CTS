package ro.ase.cts.composite.classes;

public interface AbstractComponent {
    void prntareElement();
    void adaugaElement(AbstractComponent abstractComponent);
    void stergeElement(AbstractComponent abstractComponent);
    AbstractComponent getElement(int index);
}
