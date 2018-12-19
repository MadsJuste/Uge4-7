
import entity.ClassicOrder;
import facade.classicmodelsFacade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juste
 */
public class test {
    public static void main(String args[]){
      
        classicmodelsFacade instance = new classicmodelsFacade();
        
        List<ClassicOrder> e = instance.getOrdersOnHold();
        for(int o = 0; o<e.size(); o++){
            System.out.println(e.get(o));
        }
        
        e = instance.getOrdersOnHold(144);
        for(int o = 0; o<e.size(); o++){
            System.out.println(e.get(o));
        }
    }
}
