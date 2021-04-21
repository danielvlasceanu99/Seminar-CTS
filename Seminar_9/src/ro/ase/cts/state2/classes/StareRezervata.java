package ro.ase.cts.state2.classes;

public class StareRezervata implements State{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("masa cu numarul " + masa.getNrMasa() + "a fost rezervata");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa cu numarul " + masa.getNrMasa() +" nu poate fi rezervata");        }
    }
}
