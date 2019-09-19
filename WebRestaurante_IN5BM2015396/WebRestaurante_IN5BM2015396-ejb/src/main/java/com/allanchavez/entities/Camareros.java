/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allanchavez.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "camareros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camareros.findAll", query = "SELECT c FROM Camareros c")
    , @NamedQuery(name = "Camareros.findByIdcamarero", query = "SELECT c FROM Camareros c WHERE c.idcamarero = :idcamarero")
    , @NamedQuery(name = "Camareros.findByNombre", query = "SELECT c FROM Camareros c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Camareros.findByApellido", query = "SELECT c FROM Camareros c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Camareros.findByPropina", query = "SELECT c FROM Camareros c WHERE c.propina = :propina")})
public class Camareros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcamarero")
    private Integer idcamarero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "propina")
    private int propina;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcamarero")
    private List<Facturas> facturasList;

    public Camareros() {
    }

    public Camareros(Integer idcamarero) {
        this.idcamarero = idcamarero;
    }

    public Camareros(Integer idcamarero, String nombre, String apellido, int propina) {
        this.idcamarero = idcamarero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.propina = propina;
    }

    public Integer getIdcamarero() {
        return idcamarero;
    }

    public void setIdcamarero(Integer idcamarero) {
        this.idcamarero = idcamarero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcamarero != null ? idcamarero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camareros)) {
            return false;
        }
        Camareros other = (Camareros) object;
        if ((this.idcamarero == null && other.idcamarero != null) || (this.idcamarero != null && !this.idcamarero.equals(other.idcamarero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allanchavez.entities.Camareros[ idcamarero=" + idcamarero + " ]";
    }
    
}
