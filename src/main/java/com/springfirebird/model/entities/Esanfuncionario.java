/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juliano
 */
@Entity
@Table(name = "ESANFUNCIONARIO", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Esanfuncionario.findAll", query = "SELECT e FROM Esanfuncionario e"),
    @NamedQuery(name = "Esanfuncionario.findByCdfuncionario", query = "SELECT e FROM Esanfuncionario e WHERE e.cdfuncionario = :cdfuncionario"),
    @NamedQuery(name = "Esanfuncionario.findByNmfuncionario", query = "SELECT e FROM Esanfuncionario e WHERE e.nmfuncionario = :nmfuncionario"),
    @NamedQuery(name = "Esanfuncionario.findByVlsalario", query = "SELECT e FROM Esanfuncionario e WHERE e.vlsalario = :vlsalario"),
    @NamedQuery(name = "Esanfuncionario.findByPeencargo", query = "SELECT e FROM Esanfuncionario e WHERE e.peencargo = :peencargo"),
    @NamedQuery(name = "Esanfuncionario.findByFlativo", query = "SELECT e FROM Esanfuncionario e WHERE e.flativo = :flativo"),
    @NamedQuery(name = "Esanfuncionario.findByHrtrabalhodia", query = "SELECT e FROM Esanfuncionario e WHERE e.hrtrabalhodia = :hrtrabalhodia"),
    @NamedQuery(name = "Esanfuncionario.findByGuid", query = "SELECT e FROM Esanfuncionario e WHERE e.guid = :guid")})
public class Esanfuncionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDFUNCIONARIO")
    private Integer cdfuncionario;
    @Column(name = "NMFUNCIONARIO")
    private String nmfuncionario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLSALARIO")
    private Double vlsalario;
    @Column(name = "PEENCARGO")
    private Double peencargo;
    @Column(name = "FLATIVO")
    private String flativo;
    @Column(name = "HRTRABALHODIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hrtrabalhodia;
    @Column(name = "GUID")
    private String guid;

    public Esanfuncionario() {
    }

    public Esanfuncionario(Integer cdfuncionario) {
        this.cdfuncionario = cdfuncionario;
    }

    public Integer getCdfuncionario() {
        return cdfuncionario;
    }

    public void setCdfuncionario(Integer cdfuncionario) {
        this.cdfuncionario = cdfuncionario;
    }

    public String getNmfuncionario() {
        return nmfuncionario;
    }

    public void setNmfuncionario(String nmfuncionario) {
        this.nmfuncionario = nmfuncionario;
    }

    public Double getVlsalario() {
        return vlsalario;
    }

    public void setVlsalario(Double vlsalario) {
        this.vlsalario = vlsalario;
    }

    public Double getPeencargo() {
        return peencargo;
    }

    public void setPeencargo(Double peencargo) {
        this.peencargo = peencargo;
    }

    public String getFlativo() {
        return flativo;
    }

    public void setFlativo(String flativo) {
        this.flativo = flativo;
    }

    public Date getHrtrabalhodia() {
        return hrtrabalhodia;
    }

    public void setHrtrabalhodia(Date hrtrabalhodia) {
        this.hrtrabalhodia = hrtrabalhodia;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdfuncionario != null ? cdfuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanfuncionario)) {
            return false;
        }
        Esanfuncionario other = (Esanfuncionario) object;
        if ((this.cdfuncionario == null && other.cdfuncionario != null) || (this.cdfuncionario != null && !this.cdfuncionario.equals(other.cdfuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springfirebird.model.entities.Esanfuncionario[ cdfuncionario=" + cdfuncionario + " ]";
    }
    
}
