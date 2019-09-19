package com.allanchavez.entities;

import com.allanchavez.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:19:59")
@StaticMetamodel(Camareros.class)
public class Camareros_ { 

    public static volatile SingularAttribute<Camareros, Integer> idcamarero;
    public static volatile SingularAttribute<Camareros, String> apellido;
    public static volatile SingularAttribute<Camareros, Integer> propina;
    public static volatile SingularAttribute<Camareros, String> nombre;
    public static volatile ListAttribute<Camareros, Facturas> facturasList;

}