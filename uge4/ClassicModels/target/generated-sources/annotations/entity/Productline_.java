package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2018-12-18T22:01:59")
@StaticMetamodel(Productline.class)
public class Productline_ { 

    public static volatile SingularAttribute<Productline, String> productLine;
    public static volatile SingularAttribute<Productline, byte[]> image;
    public static volatile CollectionAttribute<Productline, Product> productCollection;
    public static volatile SingularAttribute<Productline, String> textDescription;
    public static volatile SingularAttribute<Productline, String> htmlDescription;

}