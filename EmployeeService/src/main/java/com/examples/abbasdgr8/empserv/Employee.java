package com.examples.abbasdgr8.empserv;

/**
 * An employee bean class
 *
 * @author Abbas Attarwala
 */
public class Employee {
    
    private String empId;
    private String name;
    private String designation;
    
    public Employee() { }
    
    public Employee(String empId, String name, String designation) {
        setEmpId(empId);
        setName(name);
        setDesignation(designation);
    }
    
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
}
