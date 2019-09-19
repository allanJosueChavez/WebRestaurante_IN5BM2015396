package com.allanchavez.entities;

import com.allanchavez.entities.Cocineros;
import com.allanchavez.entities.Facturas;
import com.allanchavez.entities.Platillos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:19:59")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Double> totalventa;
    public static volatile SingularAttribute<Detallefactura, Platillos> idplatillo;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Integer> precioventa;
    public static volatile SingularAttribute<Detallefactura, Cocineros> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;
    public static volatile SingularAttribute<Detallefactura, Facturas> idfactura;

}