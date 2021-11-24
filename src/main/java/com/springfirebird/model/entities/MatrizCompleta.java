/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Juliano
 */
@Entity
@Table(name = "ESANMATRIZ", catalog = "", schema = "")
public class MatrizCompleta implements Serializable {

    public MatrizCompleta() {
    }

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDMATRIZ")
    private Integer cdmatriz;

    @Column(name = "ID1")
    private String id1;

    @Column(name = "ID2")
    private String id2;
    @Column(name = "DTNASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnascimento;
    @Column(name = "DTENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtentrada;
    @Column(name = "DTSAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtsaida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESOENTRADA")
    private Double pesoentrada;
    @Column(name = "PESOSAIDA")
    private Double pesosaida;
    @Column(name = "VLCOMPRA")
    private Double vlcompra;
    @Column(name = "VLVENDA")
    private Double vlvenda;
    @Column(name = "NUCICLOS")
    private Short nuciclos;
    @Column(name = "CICLOENTRADA")
    private Short cicloentrada;
    @Column(name = "FLESTADOREPRODUTIVO")
    private String flestadoreprodutivo;
    @Column(name = "FLSITUACAO")
    private String flsituacao;
    @Column(name = "FLMAEDELEITE")
    private String flmaedeleite;
    @Column(name = "FLMOTIVOENTRADA")
    private String flmotivoentrada;
    @Column(name = "DTPRIMEIRACOBERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtprimeiracobertura;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "FLLACTANTECOBERTA")
    private String fllactantecoberta;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "DTCOBERTCOMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtcobertcompra;
    @Column(name = "FLPREDESCARTE")
    private String flpredescarte;
    @Column(name = "FLCOMPRAGESTANTE")
    private String flcompragestante;

    @OneToMany(mappedBy = "cdmatriz")
    private List<Esanparto> esanpartoList;

    @OneToMany(mappedBy = "cdmatriz")
    private List<Esancobertura> esancoberturaList;

    @OneToMany(mappedBy = "cdmatriz")
    private List<Esandesmame> esandesmameList;

    public Integer getCdmatriz() {
        return cdmatriz;
    }

    public void setCdmatriz(Integer cdmatriz) {
        this.cdmatriz = cdmatriz;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public List<Esanparto> getEsanpartoList() {
        return esanpartoList;
    }

    public void setEsanpartoList(List<Esanparto> esanpartoList) {
        this.esanpartoList = esanpartoList;
    }

    public List<Esancobertura> getEsancoberturaList() {
        return esancoberturaList;
    }

    public void setEsancoberturaList(List<Esancobertura> esancoberturaList) {
        this.esancoberturaList = esancoberturaList;
    }

    public List<Esandesmame> getEsandesmameList() {
        return esandesmameList;
    }

    public void setEsandesmameList(List<Esandesmame> esandesmameList) {
        this.esandesmameList = esandesmameList;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public Date getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Date dtentrada) {
        this.dtentrada = dtentrada;
    }

    public Date getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(Date dtsaida) {
        this.dtsaida = dtsaida;
    }

    public Double getPesoentrada() {
        return pesoentrada;
    }

    public void setPesoentrada(Double pesoentrada) {
        this.pesoentrada = pesoentrada;
    }

    public Double getPesosaida() {
        return pesosaida;
    }

    public void setPesosaida(Double pesosaida) {
        this.pesosaida = pesosaida;
    }

    public Double getVlcompra() {
        return vlcompra;
    }

    public void setVlcompra(Double vlcompra) {
        this.vlcompra = vlcompra;
    }

    public Double getVlvenda() {
        return vlvenda;
    }

    public void setVlvenda(Double vlvenda) {
        this.vlvenda = vlvenda;
    }

    public Short getNuciclos() {
        return nuciclos;
    }

    public void setNuciclos(Short nuciclos) {
        this.nuciclos = nuciclos;
    }

    public Short getCicloentrada() {
        return cicloentrada;
    }

    public void setCicloentrada(Short cicloentrada) {
        this.cicloentrada = cicloentrada;
    }

    public String getFlestadoreprodutivo() {
        return flestadoreprodutivo;
    }

    public void setFlestadoreprodutivo(String flestadoreprodutivo) {
        this.flestadoreprodutivo = flestadoreprodutivo;
    }

    public String getFlsituacao() {
        return flsituacao;
    }

    public void setFlsituacao(String flsituacao) {
        this.flsituacao = flsituacao;
    }

    public String getFlmaedeleite() {
        return flmaedeleite;
    }

    public void setFlmaedeleite(String flmaedeleite) {
        this.flmaedeleite = flmaedeleite;
    }

    public String getFlmotivoentrada() {
        return flmotivoentrada;
    }

    public void setFlmotivoentrada(String flmotivoentrada) {
        this.flmotivoentrada = flmotivoentrada;
    }

    public Date getDtprimeiracobertura() {
        return dtprimeiracobertura;
    }

    public void setDtprimeiracobertura(Date dtprimeiracobertura) {
        this.dtprimeiracobertura = dtprimeiracobertura;
    }

    public Date getDtregistro() {
        return dtregistro;
    }

    public void setDtregistro(Date dtregistro) {
        this.dtregistro = dtregistro;
    }

    public String getFllactantecoberta() {
        return fllactantecoberta;
    }

    public void setFllactantecoberta(String fllactantecoberta) {
        this.fllactantecoberta = fllactantecoberta;
    }

    public String getNubaia() {
        return nubaia;
    }

    public void setNubaia(String nubaia) {
        this.nubaia = nubaia;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDtcobertcompra() {
        return dtcobertcompra;
    }

    public void setDtcobertcompra(Date dtcobertcompra) {
        this.dtcobertcompra = dtcobertcompra;
    }

    public String getFlpredescarte() {
        return flpredescarte;
    }

    public void setFlpredescarte(String flpredescarte) {
        this.flpredescarte = flpredescarte;
    }

    public String getFlcompragestante() {
        return flcompragestante;
    }

    public void setFlcompragestante(String flcompragestante) {
        this.flcompragestante = flcompragestante;
    }

    @Override
    public String toString() {
        return "MatrizCompleta{" + "id1=" + id1 + '}';
    }

}
