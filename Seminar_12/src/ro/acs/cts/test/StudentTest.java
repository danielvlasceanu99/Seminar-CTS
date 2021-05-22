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

    @Test
    public void testGetNota(){
        Student student = new Student();
        student.adaugaNota(8);
        student.adaugaNota(9);
        student.adaugaNota(5);
        student.adaugaNota(4);

        assertEquals(5, student.getNota(2));
    }

    @Test
    public void testAdaugaOSinguraNota(){
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testAdaugaNotaIncorecta(){
        Student student = new Student();
        //1
        try{
            //2
            student.adaugaNota(-1);
            //3 - nu ajunge aici
            fail("nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
        }
        catch (IllegalArgumentException ex){
            //4
        }
        catch (Exception e){
            //5 - nu ajunge aici
            fail("Nu arunca o exceptie de tipul IllegalArgument");
        }
        //6
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJunit4(){
        Student student = new Student();
        student.adaugaNota(-1);
    }

    @Test
    public void testStudentAreRestante(){
        Student student = new Student();
        student.adaugaNota(3);
        boolean rez = student.areRestante();
        assertTrue(rez);
    }

    @Test
    public void testStudentNuAreRestante(){
        Student student = new Student();
        student.adaugaNota(6);
        boolean rez = student.areRestante();
        assertFalse(rez);
    }

    @Test
    public void testCalculeazaMedieCorect(){
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);

        //assertEquals(6.5, student.calculeazaMedie());
        assertEquals(9.5, student.calculeazaMedie(), 0.0001);
    }
}