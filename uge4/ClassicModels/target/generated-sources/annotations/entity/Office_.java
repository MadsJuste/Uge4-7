package entity;

import entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2018-12-18T22:01:59")
@StaticMetamodel(Office.class)
public class Office_ { 

    public static volatile SingularAttribute<Office, String> country;
    public static volatile SingularAttribute<Office, String> city;
    public static volatile SingularAttribute<Office, String> phone;
    public static volatile SingularAttribute<Office, String> postalCode;
    public static volatile SingularAttribute<Office, String> officeCode;
    public static volatile CollectionAttribute<Office, Employee> employeeCollection;
    public static volatile SingularAttribute<Office, String> addressLine1;
    public static volatile SingularAttribute<Office, String> addressLine2;
    public static volatile SingularAttribute<Office, String> state;
    public static volatile SingularAttribute<Office, String> territory;

}