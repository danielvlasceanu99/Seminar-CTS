package ro.ase.cts.state2.classes;

public class StareOcupata implements State{
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)){
            System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost ocupata");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa cu numarul " + masa.getNrMasa() +" nu poate fi ocupata");
        }
    }
}
