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
@Table(name = "ESANPARTO", catalog = "", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Esanparto.findAll", query = "SELECT e FROM Esanparto e"),
    @NamedQuery(name = "Esanparto.findByCdparto", query = "SELECT e FROM Esanparto e WHERE e.cdparto = :cdparto"),
    @NamedQuery(name = "Esanparto.findByDtregistro", query = "SELECT e FROM Esanparto e WHERE e.dtregistro = :dtregistro"),
    @NamedQuery(name = "Esanparto.findByDtinicioparto", query = "SELECT e FROM Esanparto e WHERE e.dtinicioparto = :dtinicioparto"),
    @NamedQuery(name = "Esanparto.findByDtfimparto", query = "SELECT e FROM Esanparto e WHERE e.dtfimparto = :dtfimparto"),
    @NamedQuery(name = "Esanparto.findByHorainicioparto", query = "SELECT e FROM Esanparto e WHERE e.horainicioparto = :horainicioparto"),
    @NamedQuery(name = "Esanparto.findByHorafimparto", query = "SELECT e FROM Esanparto e WHERE e.horafimparto = :horafimparto"),
    @NamedQuery(name = "Esanparto.findByPesomatriz", query = "SELECT e FROM Esanparto e WHERE e.pesomatriz = :pesomatriz"),
    @NamedQuery(name = "Esanparto.findByEspessuratoucinhomatriz", query = "SELECT e FROM Esanparto e WHERE e.espessuratoucinhomatriz = :espessuratoucinhomatriz"),
    @NamedQuery(name = "Esanparto.findByPesoleitegada", query = "SELECT e FROM Esanparto e WHERE e.pesoleitegada = :pesoleitegada"),
    @NamedQuery(name = "Esanparto.findByNumumificado", query = "SELECT e FROM Esanparto e WHERE e.numumificado = :numumificado"),
    @NamedQuery(name = "Esanparto.findByNunatimorto", query = "SELECT e FROM Esanparto e WHERE e.nunatimorto = :nunatimorto"),
    @NamedQuery(name = "Esanparto.findByNumortoaonascer", query = "SELECT e FROM Esanparto e WHERE e.numortoaonascer = :numortoaonascer"),
    @NamedQuery(name = "Esanparto.findByNuvivo", query = "SELECT e FROM Esanparto e WHERE e.nuvivo = :nuvivo"),
    @NamedQuery(name = "Esanparto.findByNudoado", query = "SELECT e FROM Esanparto e WHERE e.nudoado = :nudoado"),
    @NamedQuery(name = "Esanparto.findByNurecebido", query = "SELECT e FROM Esanparto e WHERE e.nurecebido = :nurecebido"),
    @NamedQuery(name = "Esanparto.findByPesomedionascimento", query = "SELECT e FROM Esanparto e WHERE e.pesomedionascimento = :pesomedionascimento"),
    @NamedQuery(name = "Esanparto.findByDtmedianascimento", query = "SELECT e FROM Esanparto e WHERE e.dtmedianascimento = :dtmedianascimento"),
    @NamedQuery(name = "Esanparto.findByObs", query = "SELECT e FROM Esanparto e WHERE e.obs = :obs"),
    @NamedQuery(name = "Esanparto.findByCiclo", query = "SELECT e FROM Esanparto e WHERE e.ciclo = :ciclo"),
    @NamedQuery(name = "Esanparto.findByFlpalm", query = "SELECT e FROM Esanparto e WHERE e.flpalm = :flpalm"),
    @NamedQuery(name = "Esanparto.findByNubaia", query = "SELECT e FROM Esanparto e WHERE e.nubaia = :nubaia"),
    @NamedQuery(name = "Esanparto.findByScorecorporal", query = "SELECT e FROM Esanparto e WHERE e.scorecorporal = :scorecorporal"),
    @NamedQuery(name = "Esanparto.findByNuleitoesabaixo", query = "SELECT e FROM Esanparto e WHERE e.nuleitoesabaixo = :nuleitoesabaixo"),
    @NamedQuery(name = "Esanparto.findByNuleitoesentre", query = "SELECT e FROM Esanparto e WHERE e.nuleitoesentre = :nuleitoesentre"),
    @NamedQuery(name = "Esanparto.findByNuleitoesacima", query = "SELECT e FROM Esanparto e WHERE e.nuleitoesacima = :nuleitoesacima"),
    @NamedQuery(name = "Esanparto.findByDuracao", query = "SELECT e FROM Esanparto e WHERE e.duracao = :duracao"),
    @NamedQuery(name = "Esanparto.findByGuid", query = "SELECT e FROM Esanparto e WHERE e.guid = :guid")})
public class Esanparto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDPARTO")
    private Integer cdparto;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "DTINICIOPARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinicioparto;
    @Column(name = "DTFIMPARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtfimparto;
    @Column(name = "HORAINICIOPARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horainicioparto;
    @Column(name = "HORAFIMPARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafimparto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESOMATRIZ")
    private Double pesomatriz;
    @Column(name = "ESPESSURATOUCINHOMATRIZ")
    private Double espessuratoucinhomatriz;
    @Column(name = "PESOLEITEGADA")
    private Double pesoleitegada;
    @Column(name = "NUMUMIFICADO")
    private Integer numumificado;
    @Column(name = "NUNATIMORTO")
    private Integer nunatimorto;
    @Column(name = "NUMORTOAONASCER")
    private Integer numortoaonascer;
    @Column(name = "NUVIVO")
    private Integer nuvivo;
    @Column(name = "NUDOADO")
    private Integer nudoado;
    @Column(name = "NURECEBIDO")
    private Integer nurecebido;
    @Column(name = "PESOMEDIONASCIMENTO")
    private Double pesomedionascimento;
    @Column(name = "DTMEDIANASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "CICLO")
    private Integer ciclo;
    @Column(name = "FLPALM")
    private String flpalm;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "SCORECORPORAL")
    private Integer scorecorporal;
    @Column(name = "NULEITOESABAIXO")
    private Integer nuleitoesabaixo;
    @Column(name = "NULEITOESENTRE")
    private Integer nuleitoesentre;
    @Column(name = "NULEITOESACIMA")
    private Integer nuleitoesacima;
    @Column(name = "DURACAO")
    private String duracao;
    @Column(name = "GUID")
    private String guid;

    @Column(name = "CDMATRIZ")
    private Integer cdmatriz;

    @Column(name = "CDFUNCIONARIO")
    private Integer cdfuncionario;

    public Esanparto() {
    }

    public Esanparto(Integer cdparto) {
        this.cdparto = cdparto;
    }

    public Integer getCdfuncionario() {
        return cdfuncionario;
    }

    public void setCdfuncionario(Integer cdfuncionario) {
        this.cdfuncionario = cdfuncionario;
    }

    public Integer getCdmatriz() {
        return cdmatriz;
    }

    public void setCdmatriz(Integer cdmatriz) {
        this.cdmatriz = cdmatriz;
    }

    public Integer getCdparto() {
        return cdparto;
    }

    public void setCdparto(Integer cdparto) {
        this.cdparto = cdparto;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public Date getDtinicioparto() {
        return dtinicioparto;
    }

    public void setDtinicioparto(Date dtinicioparto) {
        this.dtinicioparto = dtinicioparto;
    }

    public Date getDtfimparto() {
        return dtfimparto;
    }

    public void setDtfimparto(Date dtfimparto) {
        this.dtfimparto = dtfimparto;
    }

    public Date getHorainicioparto() {
        return horainicioparto;
    }

    public void setHorainicioparto(Date horainicioparto) {
        this.horainicioparto = horainicioparto;
    }

    public Date getHorafimparto() {
        return horafimparto;
    }

    public void setHorafimparto(Date horafimparto) {
        this.horafimparto = horafimparto;
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

    public Double getPesoleitegada() {
        return pesoleitegada;
    }

    public void setPesoleitegada(Double pesoleitegada) {
        this.pesoleitegada = pesoleitegada;
    }

    public Integer getNumumificado() {
        return numumificado;
    }

    public void setNumumificado(Integer numumificado) {
        this.numumificado = numumificado;
    }

    public Integer getNunatimorto() {
        return nunatimorto;
    }

    public void setNunatimorto(Integer nunatimorto) {
        this.nunatimorto = nunatimorto;
    }

    public Integer getNumortoaonascer() {
        return numortoaonascer;
    }

    public void setNumortoaonascer(Integer numortoaonascer) {
        this.numortoaonascer = numortoaonascer;
    }

    public Integer getNuvivo() {
        return nuvivo;
    }

    public void setNuvivo(Integer nuvivo) {
        this.nuvivo = nuvivo;
    }

    public Integer getNudoado() {
        return nudoado;
    }

    public void setNudoado(Integer nudoado) {
        this.nudoado = nudoado;
    }

    public Integer getNurecebido() {
        return nurecebido;
    }

    public void setNurecebido(Integer nurecebido) {
        this.nurecebido = nurecebido;
    }

    public Double getPesomedionascimento() {
        return pesomedionascimento;
    }

    public void setPesomedionascimento(Double pesomedionascimento) {
        this.pesomedionascimento = pesomedionascimento;
    }

    public Date getDtmedianascimento() {
        return dtmedianascimento;
    }

    public void setDtmedianascimento(Date dtmedianascimento) {
        this.dtmedianascimento = dtmedianascimento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public String getFlpalm() {
        return flpalm;
    }

    public void setFlpalm(String flpalm) {
        this.flpalm = flpalm;
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

    public Integer getNuleitoesabaixo() {
        return nuleitoesabaixo;
    }

    public void setNuleitoesabaixo(Integer nuleitoesabaixo) {
        this.nuleitoesabaixo = nuleitoesabaixo;
    }

    public Integer getNuleitoesentre() {
        return nuleitoesentre;
    }

    public void setNuleitoesentre(Integer nuleitoesentre) {
        this.nuleitoesentre = nuleitoesentre;
    }

    public Integer getNuleitoesacima() {
        return nuleitoesacima;
    }

    public void setNuleitoesacima(Integer nuleitoesacima) {
        this.nuleitoesacima = nuleitoesacima;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
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
        hash += (cdparto != null ? cdparto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esanparto)) {
            return false;
        }
        Esanparto other = (Esanparto) object;
        if ((this.cdparto == null && other.cdparto != null) || (this.cdparto != null && !this.cdparto.equals(other.cdparto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springfirebird.model.entities.Esanparto[ cdparto=" + cdparto + " ]";
    }

}
