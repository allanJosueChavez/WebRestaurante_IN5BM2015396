package com.allanchavez.entities;

import com.allanchavez.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:19:59")
@StaticMetamodel(Platillos.class)
public class Platillos_ { 

    public static volatile SingularAttribute<Platillos, String> descripcionplatillo;
    public static volatile ListAttribute<Platillos, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Platillos, Integer> idplatillo;
    public static volatile SingularAttribute<Platillos, Double> importe;

}