package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.AplicantReadable;
import ro.ase.cts.clase.readers.ElevReader;
import ro.ase.cts.clase.readers.StudentReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
    public static List<Aplicant> citesteAplicant(String numeFisier, AplicantReadable aplicantReadable) throws FileNotFoundException {
        return aplicantReadable.readAplicant(numeFisier);
    }

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            listaAplicanti = citesteAplicant("angajati.txt", new AngajatReader());
            for(Aplicant aplicant:listaAplicanti) {
                System.out.println(aplicant.toString());
            }

            listaAplicanti = citesteAplicant("elevi.txt", new ElevReader());
            for(Aplicant aplicant:listaAplicanti) {
                System.out.println(aplicant.toString());
            }

            listaAplicanti = citesteAplicant("studenti.txt", new StudentReader());
            for(Aplicant aplicant:listaAplicanti) {
                System.out.println(aplicant.toString());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
