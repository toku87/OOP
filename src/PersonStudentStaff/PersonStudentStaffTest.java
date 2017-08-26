package PersonStudentStaff;


import org.junit.Assert;
import org.junit.Test;

public class PersonStudentStaffTest {
//TEST KONSTRUKTORA KLASY PERSON Z METODAMI GET, SET I TOSTRING
    @Test
    public void personDefaultTest () {
        Person person = new Person("Jan Wlak", "San Francisco");
        Assert.assertEquals("Jan Wlak", person.getName());
        Assert.assertEquals("San Francisco", person.getAddress());
    }
    @Test
    public void personDefaultSetAddressMethodTest () {
        Person person = new Person("Jan Bak","Lezajsk");
        Assert.assertEquals("Lezajsk", person.getAddress());
        person.setAddress("Zlotoryja");
        Assert.assertEquals("Zlotoryja", person.getAddress());
    }
    @Test
    public void personDefaultToStringMethodTest() {
        Person person = new Person("Jan Bak", "Legnica");
        Assert.assertEquals("Person [name=Jan Bak, address=Legnica", person.toString());
    }
    @Test
    public void studentDefaultTest() {
        Student student = new Student("Lech Kaczynski", "Kosmos", "etyka, kultura", 1955, 345.33);
        Assert.assertEquals("Lech Kaczynski", student.getName());
        Assert.assertEquals("Kosmos", student.getAddress());
        Assert.assertEquals("etyka, kultura", student.getProgram());
        Assert.assertEquals(1955, student.getYear());
        Assert.assertEquals(345.33, student.getFee(),0.1);
    }
    @Test
    public void studentSetProgramMethodTest() {
        Student student = new Student("Lech Kaczynski", "Kosmos", "etyka, kultura", 1955, 345.33);
        Assert.assertEquals("etyka, kultura", student.getProgram());
        student.setProgram("rzezbiarstwo, tworzenie pomnikow");
        Assert.assertEquals("rzezbiarstwo, tworzenie pomnikow", student.getProgram());
    }
    @Test
    public void studentSetYearMethodTest () {
        Student student = new Student("Lech Kaczynski", "Kosmos", "etyka, kultura", 1955, 345.33);
        Assert.assertEquals(1955, student.getYear());
        student.setYear(2017);
        Assert.assertEquals(2017, student.getYear());
    }
    @Test
    public void studentSetFeeMethodTest () {
        Student student = new Student("Lech Kaczynski", "Kosmos", "etyka, kultura", 1955, 345.33);
        Assert.assertEquals(345.33, student.getFee(), 0.1);
        student.setFee(111.21);
        Assert.assertEquals(111.21, student.getFee(), 0.1);
    }
    @Test
    public void studentToStringMethodTest () {
        Student student = new Student("Lech Kaczynski", "Kosmos", "etyka, kultura", 1955, 345.33);
        Assert.assertEquals("Student [Person [name=Lech Kaczynski, address=Kosmos], program=etyka, kultura, year=1955, fee=345,33", student.toString());
    }
}
