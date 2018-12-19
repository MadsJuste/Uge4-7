/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Juste
 */
@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    
    public Customer(){
        
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /*
    3: Der er lavet 3 tabeller 1 til address 1 til customer og en mellem tabel som holder styr på ralation imellem de 2 andre.
        Vælge ikke at bruge Joincolumn da jeg selv finder det næmmere at oritere sig med en mellem table.
    
    4:MappedBy siger hvilken Class der er hovedklassen for relations, hvilket hjælper med at holde styr på relation.
      Vi bliver nød til at tilføje et customer objekt til Address før vi persister.
    
    5:Samme som i opgave 3. der er 3 tabller som håndtere henholdsvis Addresser, Customers og relationen i mellem dem
    */
    
   
    
    @ManyToMany
    private List<Address> address = new ArrayList();

    
    public List<Address> getAddress() {
        return address;
    }

    public void addAddress(Address address) {
        this.address.add(address);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Customer[ id=" + id + " ]";
    }
    
}
