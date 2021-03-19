package program;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Girafa g1 = new Girafa("Girafa1");
        Girafa g2 = new Girafa("Girafa2");

        zoo.Add(g1);
        zoo.Add(g2);

        zoo.feedAllAnimals();
    }
}
