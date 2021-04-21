package ro.ase.cts.state2.classes;

public class StareLibera implements State{
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareLibera)){
            System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost eliberata");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa cu numarul " + masa.getNrMasa() +" nu poate fi eliberata");
        }
    }
}
