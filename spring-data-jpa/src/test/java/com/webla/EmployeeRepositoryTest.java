package com.webla;


import com.webla.product.entity.Employee;
import com.webla.product.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testCreateEmployee(){
        Employee emp = new Employee();
        emp.setName("Sandeep");

        Employee empSaved = employeeRepository.save(emp);

    }

}
