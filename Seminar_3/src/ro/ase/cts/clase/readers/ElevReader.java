package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReadable{
    public ElevReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Elev s = new Elev();
            super.readAplicant(input,s);

            int clasa = input.nextInt();
            String tutore = input.next();

            s.setClasa(clasa);
            s.setTutore(tutore);

            elevi.add(s);
        }

        input.close();
        return elevi;
    }
}
