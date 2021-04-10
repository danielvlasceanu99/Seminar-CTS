package ro.ase.cts.decorator.classes;

public abstract class AbstractDecorator implements CardBancar{
    private CardBancar card;

    public AbstractDecorator(Card card) {
        this.card = card;
    }

    public CardBancar getCard() {
        return card;
    }

    @Override
    public void platestePOS() {
        card.platestePOS();
    }

    @Override
    public void platesteOnLine() {
        card.platesteOnLine();
    }

    public abstract void platesteContactLess();
}
