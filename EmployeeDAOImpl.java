package com.vilpesh.jee.dao;

import com.vilpesh.jee.dao.Employee;
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
public class EmployeeDAOImpl implements EmployeeDAO {
    
    public int add(Employee emp) {
        System.out.println("CONNECTING.....");
        System.out.println("ADDING employee " + emp.getLastName());
        System.out.println("SUCCESSFULLY added in Employee table");
        System.out.println("DISCONNECTING......");
        return 0;
    }
    
    public int delete(int empid) {
        System.out.println("CONNECTING.....");
        System.out.println("DELETING employee WITH ID " + empid);
        System.out.println("SUCCESSFULLY deleted from Employee table");
        System.out.println("DISCONNECTING......");
        return 0; 
    }
}