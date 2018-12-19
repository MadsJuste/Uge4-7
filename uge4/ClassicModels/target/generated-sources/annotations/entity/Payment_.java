package entity;

import entity.Customer;
import entity.PaymentPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2018-12-18T22:01:59")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Double> amount;
    public static volatile SingularAttribute<Payment, PaymentPK> paymentPK;
    public static volatile SingularAttribute<Payment, Date> paymentDate;
    public static volatile SingularAttribute<Payment, Customer> customer;

}