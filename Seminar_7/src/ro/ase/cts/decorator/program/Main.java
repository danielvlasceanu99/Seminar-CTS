package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.classes.Card;
import ro.ase.cts.decorator.classes.DecoratorContactLessCard;
import ro.ase.cts.decorator.classes.DecoratorContactLessTelefon;

public class Main {
    public static void main(String[] args) {

        Card card = new Card("Gigel");
        card.platesteOnLine();;
        card.platestePOS();

        DecoratorContactLessCard decoratorContactLess = new DecoratorContactLessCard(card);

        System.out.println("============================================================");
        decoratorContactLess.platesteContactLess();
        decoratorContactLess.platestePOS();
        decoratorContactLess.platesteOnLine();

        System.out.println("============================================================");
        DecoratorContactLessTelefon decoratorContactLessTelefon = new DecoratorContactLessTelefon(card);
        decoratorContactLessTelefon.platesteContactLess();;
        decoratorContactLessTelefon.platesteOnLine();
        decoratorContactLess.platestePOS();
    }
}
