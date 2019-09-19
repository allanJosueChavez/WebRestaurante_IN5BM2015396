package com.allanchavez.entities;

import com.allanchavez.entities.Camareros;
import com.allanchavez.entities.Clientes;
import com.allanchavez.entities.Detallefactura;
import com.allanchavez.entities.Mesas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:19:59")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, Mesas> idmesa;
    public static volatile SingularAttribute<Facturas, Camareros> idcamarero;
    public static volatile ListAttribute<Facturas, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Facturas, Date> fechafactura;
    public static volatile SingularAttribute<Facturas, Clientes> idcliente;
    public static volatile SingularAttribute<Facturas, Integer> idfactura;

}