package entity;

import entity.ClassicOrder;
import entity.OrderdetailPK;
import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2018-12-18T22:01:59")
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, Product> product;
    public static volatile SingularAttribute<Orderdetail, OrderdetailPK> orderdetailPK;
    public static volatile SingularAttribute<Orderdetail, Integer> quantityOrdered;
    public static volatile SingularAttribute<Orderdetail, Short> orderLineNumber;
    public static volatile SingularAttribute<Orderdetail, Double> priceEach;
    public static volatile SingularAttribute<Orderdetail, ClassicOrder> classicOrder;

}