package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testThatEmployee_added(){
        Employee mfon = new Employee("Mfon", "Mfon");
        mfon.getFirstName();
        Employee.getCount();
     }

}