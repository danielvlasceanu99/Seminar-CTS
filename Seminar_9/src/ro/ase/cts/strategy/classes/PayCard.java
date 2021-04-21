package ro.ase.cts.strategy.classes;

public class PayCard implements Payable{
    @Override
    public void pay(float suma) {
        System.out.println("A platit cu cardul suma de " + suma + " lei");
    }
}
