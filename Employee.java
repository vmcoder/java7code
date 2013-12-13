package com.vilpesh.jee.dao;

/**
 * Aim: Demonstrate implementing DAO design pattern.
 * Supporting Classes: Factory.java,EmployeeDAO.java,EmployeeDAOImpl.java,Employee.java,CRUDEmployee.java classes.
 * Factory.java returns instances of class implementing EmployeeDAO.java interface.
 * EmployeeDAOImpl.java implements interface EmployeeDAO.java.
 * Employee.java is the Transfer or Data transfer object.
 * CRUDEmployee demonstrates doing CRUD operations on data.
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */
public class Employee {
    private String lastName;
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}