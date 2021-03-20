package ro.ase.cts.program;

import ro.ase.cts.clase.Videoclip;

public class MainVideo {
    public static void main(String[] args) {
        Videoclip videoclip1 = Videoclip.getInstance("Cats", 10, 150);
        Videoclip videoclip2 = Videoclip.getInstance("Dogs", 15, 260);

        System.out.println(videoclip1.toString());
        System.out.println(videoclip2.toString());
    }

}
