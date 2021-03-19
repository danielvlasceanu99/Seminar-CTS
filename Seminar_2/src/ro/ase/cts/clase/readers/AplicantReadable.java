package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface AplicantReadable {
    public List<Aplicant> readAplicant (String fileName) throws FileNotFoundException;
}
