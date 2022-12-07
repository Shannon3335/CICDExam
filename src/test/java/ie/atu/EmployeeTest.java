package ie.atu;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @BeforeAll
    static void beforeAll() {

    }

    @Test
    void test_success_name()
    {
        Employee Joe = new Employee("Joe",12345678902L,"Full-time","Man",50);
        assertEquals("Joe",Joe.getName());
    }

    @Test
    void test_fail_name_1()
    {
        Employee Jo;
        Exception e_message = assertThrows(IllegalArgumentException.class,()->new Employee("Jo",12345678902L,"Full-time","Woman",50));
        assertEquals("Name must be 3 to 25 character long", e_message.getMessage());
    }

    @Test
    void test_fail_name_2()
    {
        Employee All;
        Exception e_message = assertThrows(IllegalArgumentException.class, ()->new Employee("pqwertyuiopasdfghjklzxcvbnm",12345678902L,"Full-time","Woman",50));
        assertEquals("Name must be 3 to 25 character long", e_message.getMessage());
    }

    @Test
    void test_success_ppsid()
    {
        Employee Joe = new Employee("Joe",12345678902L,"Full-time","Man",50);
        assertEquals(12345678902L,Joe.getPpsId());
    }

    @Test
    void test_fail_ppsid()
    {
        Employee Shan;
        Exception e_message = assertThrows(IllegalArgumentException.class,()->new Employee("Shan", 123456L,"Full-time","Man",50 ));
        assertEquals("PPSId must be 11 digits",e_message.getMessage());

    }

    @Test
    void test_success_emp_type1()
    {
        Employee Joe = new Employee("Joe",12345678902L,"Full-time","Man",50);
        assertEquals("Full-time",Joe.getEmploymentType());
    }

    @Test
    void test_success_emp_type2()
    {
        Employee Joe = new Employee("Joe",12345678902L,"Part-time","Man",50);
        assertEquals("Part-time",Joe.getEmploymentType());
    }

    @Test
    void test_success_emp_type3()
    {
        Employee Joe = new Employee("Joe",12345678902L,"Contract","Man",50);
        assertEquals("Contract",Joe.getEmploymentType());
    }

    @Test
    void test_success_gender()
    {
        Employee Joe = new Employee("Joe",12345678902L,"Part-time","Non-Binary",50);
        assertEquals("Non-Binary",Joe.getGender());
    }

    @AfterAll
    static void afterAll() {

    }
}