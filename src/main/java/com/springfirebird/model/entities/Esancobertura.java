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
@Table(name = "ESANCOBERTURA", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Esancobertura.findAll", query = "SELECT e FROM Esancobertura e"),
    @NamedQuery(name = "Esancobertura.findByCdcobertura", query = "SELECT e FROM Esancobertura e WHERE e.cdcobertura = :cdcobertura"),
    @NamedQuery(name = "Esancobertura.findByDtregistro", query = "SELECT e FROM Esancobertura e WHERE e.dtregistro = :dtregistro"),
    @NamedQuery(name = "Esancobertura.findByDtcobertura", query = "SELECT e FROM Esancobertura e WHERE e.dtcobertura = :dtcobertura"),
    @NamedQuery(name = "Esancobertura.findByHoracobertura", query = "SELECT e FROM Esancobertura e WHERE e.horacobertura = :horacobertura"),
    @NamedQuery(name = "Esancobertura.findByCiclo", query = "SELECT e FROM Esancobertura e WHERE e.ciclo = :ciclo"),
    @NamedQuery(name = "Esancobertura.findByFlmaedeleite", query = "SELECT e FROM Esancobertura e WHERE e.flmaedeleite = :flmaedeleite"),
    @NamedQuery(name = "Esancobertura.findByPesomatriz", query = "SELECT e FROM Esancobertura e WHERE e.pesomatriz = :pesomatriz"),
    @NamedQuery(name = "Esancobertura.findByEspessuratoucinhomatriz", query = "SELECT e FROM Esancobertura e WHERE e.espessuratoucinhomatriz = :espessuratoucinhomatriz"),
    @NamedQuery(name = "Esancobertura.findByIdcobertura", query = "SELECT e FROM Esancobertura e WHERE e.idcobertura = :idcobertura"),
    @NamedQuery(name = "Esancobertura.findByFlinseminacao", query = "SELECT e FROM Esancobertura e WHERE e.flinseminacao = :flinseminacao"),
    @NamedQuery(name = "Esancobertura.findByObs", query = "SELECT e FROM Esancobertura e WHERE e.obs = :obs"),
    @NamedQuery(name = "Esancobertura.findByFlpalm", query = "SELECT e FROM Esancobertura e WHERE e.flpalm = :flpalm"),
    @NamedQuery(name = "Esancobertura.findByFlcobertanalactacao", query = "SELECT e FROM Esancobertura e WHERE e.flcobertanalactacao = :flcobertanalactacao"),
    @NamedQuery(name = "Esancobertura.findByNubaia", query = "SELECT e FROM Esancobertura e WHERE e.nubaia = :nubaia"),
    @NamedQuery(name = "Esancobertura.findByScorecorporal", query = "SELECT e FROM Esancobertura e WHERE e.scorecorporal = :scorecorporal"),
    @NamedQuery(name = "Esancobertura.findByFlcompragestante", query = "SELECT e FROM Esancobertura e WHERE e.flcompragestante = :flcompragestante"),
    @NamedQuery(name = "Esancobertura.findByGuid", query = "SELECT e FROM Esancobertura e WHERE e.guid = :guid")})
public class Esancobertura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDCOBERTURA")
    private Integer cdcobertura;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "DTCOBERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtcobertura;
    @Column(name = "HORACOBERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horacobertura;
    @Column(name = "CICLO")
    private Integer ciclo;
    @Column(name = "FLMAEDELEITE")
    private String flmaedeleite;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESOMATRIZ")
    private Double pesomatriz;
    @Column(name = "ESPESSURATOUCINHOMATRIZ")
    private Double espessuratoucinhomatriz;
    @Column(name = "IDCOBERTURA")
    private Integer idcobertura;
    @Column(name = "FLINSEMINACAO")
    private String flinseminacao;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "FLPALM")
    private String flpalm;
    @Column(name = "FLCOBERTANALACTACAO")
    private String flcobertanalactacao;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "SCORECORPORAL")
    private Integer scorecorporal;
    @Column(name = "FLCOMPRAGESTANTE")
    private String flcompragestante;
    @Column(name = "GUID")
    private String guid;

    @Column(name = "CDMATRIZ")
    private Integer cdmatriz;

    @Column(name = "CDFUNCIONARIO")
    private Integer cdfuncionario;

    public Esancobertura() {
    }

    public Esancobertura(Integer cdcobertura) {
        this.cdcobertura = cdcobertura;
    }

    public Integer getCdcobertura() {
        return cdcobertura;
    }

    public Integer getCdmatriz() {
        return cdmatriz;
    }

    public void setCdmatriz(Integer cdmatriz) {
        this.cdmatriz = cdmatriz;
    }

    public void setCdcobertura(Integer cdcobertura) {
        this.cdcobertura = cdcobertura;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public Date getDtcobertura() {
        return dtcobertura;
    }

    public void setDtcobertura(Date dtcobertura) {
        this.dtcobertura = dtcobertura;
    }

    public Date getHoracobertura() {
        return horacobertura;
    }

    public void setHoracobertura(Date horacobertura) {
        this.horacobertura = horacobertura;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCdfuncionario() {
        return cdfuncionario;
    }

    public void setCdfuncionario(Integer cdfuncionario) {
        this.cdfuncionario = cdfuncionario;
    }

    public String getFlmaedeleite() {
        return flmaedeleite;
    }

    public void setFlmaedeleite(String flmaedeleite) {
        this.flmaedeleite = flmaedeleite;
    }

    public Double getPesomatriz() {
        return pesomatriz;
    }

    public void setPesomatriz(Double pesomatriz) {
        this.pesomatriz = pesomatriz;
    }

    public Double getEspessuratoucinhomatriz() {
        return espessuratoucinhomatriz;
    }

    public void setEspessuratoucinhomatriz(Double espessuratoucinhomatriz) {
        this.espessuratoucinhomatriz = espessuratoucinhomatriz;
    }

    public Integer getIdcobertura() {
        return idcobertura;
    }

    public void setIdcobertura(Integer idcobertura) {
        this.idcobertura = idcobertura;
    }

    public String getFlinseminacao() {
        return flinseminacao;
    }

    public void setFlinseminacao(String flinseminacao) {
        this.flinseminacao = flinseminacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getFlpalm() {
        return flpalm;
    }

    public void setFlpalm(String flpalm) {
        this.flpalm = flpalm;
    }

    public String getFlcobertanalactacao() {
        return flcobertanalactacao;
    }

    public void setFlcobertanalactacao(String flcobertanalactacao) {
        this.flcobertanalactacao = flcobertanalactacao;
    }

    public String getNubaia() {
        return nubaia;
    }

    public void setNubaia(String nubaia) {
        this.nubaia = nubaia;
    }

    public Integer getScorecorporal() {
        return scorecorporal;
    }

    public void setScorecorporal(Integer scorecorporal) {
        this.scorecorporal = scorecorporal;
    }

    public String getFlcompragestante() {
        return flcompragestante;
    }

    public void setFlcompragestante(String flcompragestante) {
        this.flcompragestante = flcompragestante;
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
        hash += (cdcobertura != null ? cdcobertura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esancobertura)) {
            return false;
        }
        Esancobertura other = (Esancobertura) object;
        if ((this.cdcobertura == null && other.cdcobertura != null) || (this.cdcobertura != null && !this.cdcobertura.equals(other.cdcobertura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springfirebird.model.entities.Esancobertura[ cdcobertura=" + cdcobertura + " ]";
    }

}
