package program;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Giraffe g1 = new Giraffe("Girafa1");
        Giraffe g2 = new Giraffe("Girafa2");

        zoo.Add(g1);
        zoo.Add(g2);

        zoo.feedAllAnimals();
    }
}
