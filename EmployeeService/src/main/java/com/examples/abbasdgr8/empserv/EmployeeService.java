package com.examples.abbasdgr8.empserv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Service Implementation Bean for the Employee Service.
 *
 * @author Abbas Attarwala
 */
@WebService
public class EmployeeService {
    
    private final Map<String, Employee> organization;
    
    @WebMethod
    public Employee getEmployee(String empId) {
        return organization.get(empId);
    }
    
    @WebMethod
    public List<Employee> getAllEmployees() {
        return new ArrayList<Employee>(organization.values());
    }
    
    EmployeeService() {
        organization = new HashMap<>();
        
        Employee e1 = new Employee("001", "Employee1", "Designation1");
        organization.put("001", e1);
        
        Employee e2 = new Employee("002", "Employee2", "Designation2");
        organization.put("002", e2);
        
        Employee e3 = new Employee("003", "Employee3", "Designation3");
        organization.put("003", e3);
        
        Employee e4 = new Employee("004", "Employee4", "Designation4");
        organization.put("004", e4);
        
        Employee e5 = new Employee("005", "Employee5", "Designation5");
        organization.put("005", e5);
    }
}
