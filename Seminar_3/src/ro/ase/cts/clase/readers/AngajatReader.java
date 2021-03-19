package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReadable{
    public AngajatReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Angajat s = new Angajat();
            super.readAplicant(input,s);

            int salariu = input.nextInt();
            String ocupatie = input.next();

            s.setSalariu(salariu);
            s.setOcupatie(ocupatie);

            angajati.add(s);
        }
        input.close();
        return angajati;
    }
}
