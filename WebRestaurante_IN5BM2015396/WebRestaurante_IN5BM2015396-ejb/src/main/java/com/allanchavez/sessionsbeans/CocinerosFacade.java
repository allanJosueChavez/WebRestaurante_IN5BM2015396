/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allanchavez.sessionsbeans;

import com.allanchavez.entities.Cocineros;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class CocinerosFacade extends AbstractFacade<Cocineros> implements CocinerosFacadeLocal {

    @PersistenceContext(unitName = "WebRestaurante_IN5BM2015396PU1")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CocinerosFacade() {
        super(Cocineros.class);
    }
    
}
