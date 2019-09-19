/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allanchavez.sessionsbeans;

import com.allanchavez.entities.Tipoclientes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface TipoclientesFacadeLocal {

    void create(Tipoclientes tipoclientes);

    void edit(Tipoclientes tipoclientes);

    void remove(Tipoclientes tipoclientes);

    Tipoclientes find(Object id);

    List<Tipoclientes> findAll();

    List<Tipoclientes> findRange(int[] range);

    int count();
    
}
