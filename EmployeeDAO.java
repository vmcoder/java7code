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
public interface EmployeeDAO {
    
    public int add(Employee emp);
    public int delete(int empid);
}