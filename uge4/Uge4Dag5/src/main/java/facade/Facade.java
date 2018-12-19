/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Semester;
import entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("e_Uge4Dag5_jar_1.0-SNAPSHOTPU");
    return emf.createEntityManager();
    }
    
    public List<Student> getAllStudents(){
        EntityManager em = getEntityManager();
        List<Student> stud = new ArrayList();
        try{
            stud = em.createNamedQuery("Student.findAll").getResultList();
            }finally{
              em.close();
           }
        return stud;   
    }
    
     public List<Student> getAllStudentsFirstName(String name){
        EntityManager em = getEntityManager();
        List<Student> stud = new ArrayList();
        try{
            Query query = em.createQuery("SELECT s FROM Student s WHERE s.firstname = :name");
            query.setParameter("name", name);
            stud = query.getResultList();
            }finally{
              em.close();
           }
        return stud;   
    }
     
     public void createStudent(Student stud){
        EntityManager em = getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(stud);
            em.getTransaction().commit();
            }finally{
              em.close();
           }
     }
     
     public void assignStudent(Student stud, Semester semesterID){
        EntityManager em = getEntityManager();
        stud.setCurrentsemesterId(semesterID);
        try{
            em.getTransaction().begin();
            em.persist(stud);
            em.getTransaction().commit();
            }finally{
              em.close();
           }
     }
     
     public List<Student> getAllStudentsLastName(String name){
        EntityManager em = getEntityManager();
        List<Student> stud = new ArrayList();
        try{
            Query query = em.createQuery("SELECT s FROM Student s WHERE s.lastname = :name");
            query.setParameter("name", name);
            stud = query.getResultList();
            }finally{
              em.close();
           }
        return stud;   
    }
     
     public List<Student> getStudentForSemester(String name){
         EntityManager em = getEntityManager();
         List<Student> stud = new ArrayList();
        
        try{
            Semester s = em.find(Semester.class, name);
            Query query = em.createQuery("SELECT s FROM Student s WHERE s.currentsemesterId = :semesterID");
            query.setParameter("semesterID", s.getId());

            stud = query.getResultList();
            }finally{
              em.close();
           }
        return stud;
        
    }
     
     public void totalNumberOfStudents(){
         EntityManager em = getEntityManager();
        
        
        try{
          
            }finally{
              em.close();
           }
       
        
    }
     
}
