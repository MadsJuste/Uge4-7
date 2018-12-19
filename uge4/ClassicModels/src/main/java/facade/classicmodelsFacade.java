/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.ClassicOrder;
import entity.Customer;
import entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Juste
 * 
 * All of the generated Classes except for the PKs, has generated the namequerys for all of their Variables plus a findall method.
 * All variables are defined, with column name and basic.
 * And all getters and setters are made.
 * The PK associated classes are similar to the none PK assosiated classes except they also have getter, setters constructors and named querys for the associated PK class
 * The PK classes have getter, setters and constructors only for their class and no named querys.
 */
public class classicmodelsFacade {
    
    EntityManagerFactory emf;
    public classicmodelsFacade(EntityManagerFactory emf) {
    this.emf = emf;
    }

    public classicmodelsFacade() {
        
    }
    EntityManager getEntityManager(){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("e_ClassicModels_jar_1.0-SNAPSHOTPU");
    return emf.createEntityManager();
    }
    
    public Employee createEmploye(Integer employeeNumber, String lastName, String firstName, String extension, String email, String jobTitle){
        EntityManager em = getEntityManager();
        Employee e = new Employee(employeeNumber,lastName, firstName,extension,email,jobTitle);
        try{
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
            }finally{
              em.close();
           }
        return e;
        
    }
    public Customer updateCustomer(Customer cust){
        EntityManager em = getEntityManager();
        Customer cus = findCustomer(cust.getCustomerNumber());
        try{
            em.getTransaction().begin();
            em.persist(cus);
            em.getTransaction().commit();
            }finally{
              em.close();
           }
        return cus;
    }
    
    public Customer findCustomer(int id){
        EntityManager em = getEntityManager();
        Customer cus = new Customer();
        try{
            cus = (Customer) em.createNamedQuery("Customer.findByCustomerNumber");
             //cus = em.find(Customer.class, id);
             // er begge måder ikke muligt?
            }finally{
              em.close();
           }
        return cus;
        
    } 
    
    public int getEmployeeCount(){
        EntityManager em = getEntityManager();
        int result;
        try{
            List<Employee> e = em.createNamedQuery("Employee.findAll").getResultList();
            result = e.size();
            }finally{
              em.close();
           }
        return result;
        
    }
    
    public List<Employee> getAllEmployees(){
        EntityManager em = getEntityManager();
        List<Employee> e = new ArrayList();
        try{
            e = em.createNamedQuery("Employee.findAll").getResultList();
            }finally{
              em.close();
           }
        return e;
        
    }
    
    public List<Customer> getCustomerInCity(String city){
        EntityManager em = getEntityManager();
        List<Customer> cust = new ArrayList();
        try{
            cust = em.createNamedQuery("Customer.findByCity").getResultList();
            }finally{
              em.close();
           }
        return cust;
        
    }
    
    public Employee getEmployeMaxCustomers(){
        EntityManager em = getEntityManager();
        Employee e = new Employee();
        try{
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT e FROM Employee e");
            query.setMaxResults(1);
            e  = (Employee) query;
            }finally{
              em.close();
           }
        return null;
        
    }
    public List<ClassicOrder> getOrdersOnHold(){
        EntityManager em = getEntityManager();
        List<ClassicOrder> o = new ArrayList();
        try{
            String status = "On Hold";
            Query query = em.createNamedQuery("ClassicOrder.findByStatus");
            query.setParameter("status", status);
            o = query.getResultList();
            }finally{
              em.close();
           }
        return o;
        
    }
    
    public List<ClassicOrder> getOrdersOnHold(int customerNumber){
        EntityManager em = getEntityManager();
         List<ClassicOrder> o = new ArrayList();
         Customer c = em.find(Customer.class, customerNumber);
        try{
            String status = "On Hold";
           
            Query query = em.createQuery("SELECT c FROM ClassicOrder c WHERE c.status = :status AND c.customerNumber =:customerNumber");
            query.setParameter("status", status);
            query.setParameter("customerNumber", c);
            o = query.getResultList();
            }finally{
              em.close();
           }
        return o;
        
    }
    
    public List<String> getCustomerNamesSorted() {
        EntityManager em = getEntityManager();
        try{
            }finally{
              em.close();
           }
        return null;
        
    }
}
