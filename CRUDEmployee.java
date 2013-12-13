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
public class CRUDEmployee {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setLastName("Wall");
        
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        System.out.println("Employee ADD initiated ....");
        employeeDAO.add(emp);
        System.out.println("------------------------------------");
        
        System.out.println("Employee DELETE initiated ....");
        employeeDAO.delete(345);//Assume Employee has ID 345
        System.out.println("------------------------------------");
        
        
        
        System.out.println("-----------using FACTORY design pattern---------------");
        emp.setLastName("Page");
        Factory factory = new Factory();
        factory.giveEmployeeDAO().add(emp);
        factory.giveEmployeeDAO().delete(678);
        System.out.println("------------------------------------------------------");
    }
}