package ro.ase.cts.decorator.classes;

public class Card implements CardBancar{
    private String titlualr;

    public String getTitlualr() {
        return titlualr;
    }

    public Card(String titlualr) {
        this.titlualr = titlualr;
    }

    @Override
    public void platestePOS() {
        System.out.println(this.titlualr + "a platit prin intermediul POS-ului");
    }

    @Override
    public void platesteOnLine() {
        System.out.println(this.titlualr + "a platit online");
    }
}
