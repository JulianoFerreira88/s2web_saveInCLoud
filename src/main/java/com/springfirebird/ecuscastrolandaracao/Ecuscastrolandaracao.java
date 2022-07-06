package com.springfirebird.ecuscastrolandaracao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ECUSCASTROLANDARACAO", catalog = "", schema = "")
@XmlRootElement
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Ecuscastrolandaracao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDAUTO")
    private Integer cdauto;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Column(name = "CDEMPRESA")
    private Integer cdempresa;
    @Column(name = "QUANTIDADERACAO")
    private Integer quantidaderacao;
    @Column(name = "VALORUNITARIO")
    private Integer valorunitario;
    @Column(name = "CODRACAO")
    private Integer codracao;
    @Column(name = "QTPLANTEL")
    private Integer qtplantel;
    @Column(name = "QTREPRODUCAO")
    private Integer qtreproducao;
    @Column(name = "QTMATERNIDADE")
    private Integer qtmaternidade;
    @Column(name = "QTCRECHE")
    private Integer qtcreche;
    @Column(name = "QTTERMINACAO")
    private Integer qtterminacao;
    @Column(name = "FLMAPEADO")
    private String flmapeado;
    @Column(name = "QTSOBRA")
    private Integer qtsobra;
    @Column(name = "CDORIGEM")
    private Integer cdorigem;

}
