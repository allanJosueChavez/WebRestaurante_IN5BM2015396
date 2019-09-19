/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allanchavez.sessionsbeans;

import com.allanchavez.entities.Camareros;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface CamarerosFacadeLocal {

    void create(Camareros camareros);

    void edit(Camareros camareros);

    void remove(Camareros camareros);

    Camareros find(Object id);

    List<Camareros> findAll();

    List<Camareros> findRange(int[] range);

    int count();
    
}
