package ro.ase.cts.program;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.AplicantReadable;
import ro.ase.cts.clase.readers.ElevReader;
import ro.ase.cts.clase.readers.StudentReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
    public static List<Aplicant> citesteAplicant(AplicantReadable aplicantReadable) throws FileNotFoundException{
        return aplicantReadable.readAplicants();
    }

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            Proiect proiect = new Proiect(80);
            listaAplicanti = citesteAplicant(new ElevReader("elevi.txt"));
            for(Aplicant aplicant:listaAplicanti){
                System.out.println(aplicant.toString());
                System.out.println(aplicant.getFinantare());
                aplicant.displayStateInProject(proiect);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
