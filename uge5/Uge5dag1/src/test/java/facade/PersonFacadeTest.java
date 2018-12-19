/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juste
 */
public class PersonFacadeTest {
    
    public PersonFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addEntityManagerFactory method, of class PersonFacade.
     */
    @Test
    public void testAddEntityManagerFactory() {
        System.out.println("addEntityManagerFactory");
        EntityManagerFactory emf = null;
        PersonFacade instance = new PersonFacade();
        instance.addEntityManagerFactory(emf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class PersonFacade.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        Person p = null;
        PersonFacade instance = new PersonFacade();
        Person expResult = null;
        Person result = instance.addPerson(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePerson method, of class PersonFacade.
     */
    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        int id = 1;
        PersonFacade instance = new PersonFacade();
        Person expResult = null;
        Person result = instance.deletePerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class PersonFacade.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int id = 1;
        PersonFacade instance = new PersonFacade();
        Person expResult = null;
        Person result = instance.getPerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPersons method, of class PersonFacade.
     */
    @Test
    public void testGetAllPersons() {
        System.out.println("getAllPersons");
        PersonFacade instance = new PersonFacade();
        List<Person> expResult = null;
        List<Person> result = instance.getAllPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPerson method, of class PersonFacade.
     */
    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
        Person p = null;
        PersonFacade instance = new PersonFacade();
        Person expResult = null;
        Person result = instance.editPerson(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
