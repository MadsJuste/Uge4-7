/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Juste
 */
public class Facade {
    EntityManagerFactory emf;
    public Facade(EntityManagerFactory emf) {
    this.emf = emf;
    }

    public Facade() {
        
    }
    EntityManager getEntityManager(){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("e_Uge4dag4_jar_1.0-SNAPSHOTPU");
    return emf.createEntityManager();
    }
    
    public void createCustomer(String name, String email){
        EntityManager em = getEntityManager();
        Customer cust = new Customer(name,email);
        try{
            em.getTransaction().begin();
            em.persist(cust);
            em.getTransaction().commit();
            }finally{
              em.close();
           }
       
    }
    
    public Customer findCustomer(int id){
        EntityManager em = getEntityManager();
        Customer cust = new Customer();
        try{
            cust = em.find(Customer.class, id);
            }finally{
              em.close();
           }
        return cust;
    }
    
    public List<Customer> getAllCustomers(){
        EntityManager em = getEntityManager();
        List<Customer> cust = new ArrayList();
        try{
            cust = em.createNamedQuery("Customer.findAll").getResultList();
            }finally{
              em.close();
           }
        return cust;
    }
    
   
}
