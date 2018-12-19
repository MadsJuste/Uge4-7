/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Customer;
import facade.Facade;
import java.util.List;

/**
 *
 * @author Juste
 */
public class test {
     public static void main(String args[]){
      
        Facade instance = new Facade();
       /* 
        instance.createCustomer("hej", "hejsa mail");
        
       Customer cust = instance.findCustomer(2);
       System.out.println(cust.getName());*/
       
       List<Customer> cust = instance.getAllCustomers();
       for(int o=0; o<cust.size();o++){
           System.out.println(cust.get(o).getName());
       }
    }
}
