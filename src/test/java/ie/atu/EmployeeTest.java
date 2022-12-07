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
    @AfterAll
    static void afterAll() {

    }
}