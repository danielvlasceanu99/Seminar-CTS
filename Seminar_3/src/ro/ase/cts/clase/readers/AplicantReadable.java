package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReadable {

    protected String fileName;

    public AplicantReadable(String fileName) {
        this.fileName = fileName;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException;

    public void readAplicant(Scanner input, Aplicant aplicant) throws FileNotFoundException{
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumireProiect(vect, nr);
    }
}