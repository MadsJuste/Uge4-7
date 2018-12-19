package entity;

import entity.ClassicOrder;
import entity.Employee;
import entity.Payment;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2018-12-18T22:01:59")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> country;
    public static volatile SingularAttribute<Customer, String> city;
    public static volatile SingularAttribute<Customer, String> contactFirstName;
    public static volatile SingularAttribute<Customer, String> postalCode;
    public static volatile SingularAttribute<Customer, Employee> salesRepEmployeeNumber;
    public static volatile SingularAttribute<Customer, Integer> customerNumber;
    public static volatile CollectionAttribute<Customer, Payment> paymentCollection;
    public static volatile SingularAttribute<Customer, String> customerName;
    public static volatile CollectionAttribute<Customer, ClassicOrder> classicOrderCollection;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> addressLine1;
    public static volatile SingularAttribute<Customer, Double> creditLimit;
    public static volatile SingularAttribute<Customer, String> contactLastName;
    public static volatile SingularAttribute<Customer, String> addressLine2;
    public static volatile SingularAttribute<Customer, String> state;

}