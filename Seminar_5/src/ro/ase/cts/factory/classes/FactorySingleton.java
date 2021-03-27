package ro.ase.cts.factory.classes;

public class FactorySingleton {
    private static FactorySingleton factorySingleton = null;

    public static synchronized FactorySingleton getInstance(){
        if (FactorySingleton.factorySingleton == null){
            FactorySingleton.factorySingleton = new FactorySingleton();
        }
        return FactorySingleton.factorySingleton;
    }

    private FactorySingleton(){}

    public PersonalMedical create(TipPersonal tipPersonal, String nume, float salariu){
        switch (tipPersonal){
            case MEDIC: return new Medic(nume, salariu);
            case ASISTENT: return new Asistent(nume, salariu);
            case BRANCARDIER: return new Brancardier(nume, salariu);
            default:throw new IllegalArgumentException("Tip invalid");
        }
    }
}
