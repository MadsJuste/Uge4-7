/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Book;
import entity.Customer;
import static enums.CustomerType.GOLD;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Juste
 */
public class Tester {
    public static void main(String args[]){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Uge4PU" );
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        Long id = 1l;
        Customer cus = em.find(Customer.class, id);
        cus.setCustomerType(GOLD);
        em.persist(cus);
        
        cus.addHobbies("MTG");
        em.persist(cus);
        
        cus.addPhone("21844131", "mit");
        em.persist(cus);
        System.out.println("Book ID is: " + em.find(Book.class, id).getId() );
        System.out.println("Book name is: " + em.find(Book.class, id).getTitle() );
        
        System.out.println("Phone Description is: " + em.find(Customer.class,id).getPhoneDescription("21844131") );
        
        
        
        em.getTransaction().commit();
        em.close();
    }
}
