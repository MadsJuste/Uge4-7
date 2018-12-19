package entity;

import entity.Customer;
import entity.Orderdetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2018-12-18T22:01:59")
@StaticMetamodel(ClassicOrder.class)
public class ClassicOrder_ { 

    public static volatile SingularAttribute<ClassicOrder, Integer> orderNumber;
    public static volatile SingularAttribute<ClassicOrder, String> comments;
    public static volatile CollectionAttribute<ClassicOrder, Orderdetail> orderdetailCollection;
    public static volatile SingularAttribute<ClassicOrder, Date> requiredDate;
    public static volatile SingularAttribute<ClassicOrder, Customer> customerNumber;
    public static volatile SingularAttribute<ClassicOrder, Date> orderDate;
    public static volatile SingularAttribute<ClassicOrder, Date> shippedDate;
    public static volatile SingularAttribute<ClassicOrder, String> status;

}