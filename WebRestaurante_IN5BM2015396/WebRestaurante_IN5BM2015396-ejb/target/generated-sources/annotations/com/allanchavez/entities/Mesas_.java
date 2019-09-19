package com.allanchavez.entities;

import com.allanchavez.entities.Areas;
import com.allanchavez.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:19:59")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesa;
    public static volatile SingularAttribute<Mesas, String> descripcion;
    public static volatile SingularAttribute<Mesas, Areas> idarea;
    public static volatile SingularAttribute<Mesas, Integer> numeromaxpersonas;
    public static volatile ListAttribute<Mesas, Facturas> facturasList;

}