package ro.ase.cts.state2.program;

import ro.ase.cts.state2.classes.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(2);

        masa.elibereazaMasa();

        masa.rezervareMasa();
        masa.rezervareMasa();

        masa.ocupaMasa();
        masa.ocupaMasa();

        masa.elibereazaMasa();
    }
}
