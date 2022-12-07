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
    @AfterAll
    static void afterAll() {

    }
}