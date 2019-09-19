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
@Table(name = "platillos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platillos.findAll", query = "SELECT p FROM Platillos p")
    , @NamedQuery(name = "Platillos.findByIdplatillo", query = "SELECT p FROM Platillos p WHERE p.idplatillo = :idplatillo")
    , @NamedQuery(name = "Platillos.findByDescripcionplatillo", query = "SELECT p FROM Platillos p WHERE p.descripcionplatillo = :descripcionplatillo")
    , @NamedQuery(name = "Platillos.findByImporte", query = "SELECT p FROM Platillos p WHERE p.importe = :importe")})
public class Platillos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idplatillo")
    private Integer idplatillo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcionplatillo")
    private String descripcionplatillo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "importe")
    private double importe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idplatillo")
    private List<Detallefactura> detallefacturaList;

    public Platillos() {
    }

    public Platillos(Integer idplatillo) {
        this.idplatillo = idplatillo;
    }

    public Platillos(Integer idplatillo, String descripcionplatillo, double importe) {
        this.idplatillo = idplatillo;
        this.descripcionplatillo = descripcionplatillo;
        this.importe = importe;
    }

    public Integer getIdplatillo() {
        return idplatillo;
    }

    public void setIdplatillo(Integer idplatillo) {
        this.idplatillo = idplatillo;
    }

    public String getDescripcionplatillo() {
        return descripcionplatillo;
    }

    public void setDescripcionplatillo(String descripcionplatillo) {
        this.descripcionplatillo = descripcionplatillo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplatillo != null ? idplatillo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillos)) {
            return false;
        }
        Platillos other = (Platillos) object;
        if ((this.idplatillo == null && other.idplatillo != null) || (this.idplatillo != null && !this.idplatillo.equals(other.idplatillo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allanchavez.entities.Platillos[ idplatillo=" + idplatillo + " ]";
    }
    
}
