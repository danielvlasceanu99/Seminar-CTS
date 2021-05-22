package ro.acs.cts.test;

import org.junit.Test;
import ro.acs.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void testConstructorWorksCorectlyForName(){
        String nume = "Gigel";
        Student student = new Student(nume);
        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void testSetNume(){
        String nume = "Popescu";
        Student student = new Student();
        student.setNume(nume);
        assertEquals(nume, student.getNume());
    }

    @Test
    public void testDefaultConstructorWorksCorectly(){
        Student student = new Student();
        assertNotNull("Lista nu a fost initializata", student.getNote());
        assertNotNull("Nu a fost initializat numele", student.getNume());
    }

    @Test
    public void teestAdaugaNota(){
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(10, student.getNota(0));
    }
}