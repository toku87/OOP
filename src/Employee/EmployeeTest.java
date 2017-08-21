package Employee;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    //Testowanie metod domyślnego konstruktora
    @Test
    public void employeeDefaultGetIdGetFirstNameGetLastNameGetSalaryTest(){
        Employee employee = new Employee(1, "Jan", "Kowalski", 2000);
        Assert.assertEquals(1, employee.getId());
        Assert.assertEquals("Jan", employee.getFirstName());
        Assert.assertEquals("Kowalski", employee.getLastName());
        Assert.assertEquals(2000, employee.getSalary());
    }

    @Test
    public void employeeDefaultGetNameTest(){
        Employee employee = new Employee(1, "Jan", "Kowalski", 2000);
        Assert.assertEquals("Jan Kowalski", employee.getName());
    }

    @Test
    public void employeeDefaultSetSalaryTest(){
        Employee employee = new Employee(1, "Jan", "Kowalski", 2000);
        employee.setSalary(2300);
        Assert.assertEquals(2300, employee.getSalary());
    }

    @Test
    public void employeeDefaultGetAnnualSalaryTest(){
        Employee employee = new Employee(1, "Jan", "Kowalski", 2000);
        Assert.assertEquals(24000, employee.getAnnualSalary());
    }

    @Test
    public void employeeDefaultRaiseSalaryTest(){
        Employee employee = new Employee(1, "Jan", "Kowalski", 2000);
        Assert.assertEquals(2200, employee.raiseSalary(10));
    }

    public void employeeDefaultStringTest(){
        Employee employee = new Employee(1, "Jan", "Kowalski", 2000);
        Assert.assertEquals("Employee[id=1,name=Jan Kowalski,salary=2000]", employee.toString());
    }
}
