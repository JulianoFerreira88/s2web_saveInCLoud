package com.springfirebird.esanmovanimais;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ESANMOVANIMAIS", catalog = "", schema = "")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Esanmovanimais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDMOVANIMAIS")
    private Integer cdmovanimais;
    @Column(name = "CDMOVANIMAIS2")
    private Integer cdmovanimais2;
    @Column(name = "FLTIPO")
    private String fltipo;
    @Column(name = "FLTIPOVENDA")
    private String fltipovenda;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "DTMOVIMENTACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmovimentacao;
    @Column(name = "QTANIMAIS")
    private Integer qtanimais;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private Double peso;
    @Column(name = "DTNASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnascimento;
    @Column(name = "CDRELACIONADO")
    private Integer cdrelacionado;
    @Column(name = "HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    @Column(name = "FLPALM")
    private String flpalm;
    @Column(name = "VALOR")
    private Double valor;
    @Column(name = "NUBAIA")
    private String nubaia;
    @Column(name = "CDLOTE2")
    private Integer cdlote2;
    @Column(name = "CDCARGAANIMAL")
    private Integer cdcargaanimal;
    @Column(name = "QTANIMAISPOSABATE")
    private Integer qtanimaisposabate;
    @Column(name = "FLACERTOMATERNIDADEAGRINESS")
    private String flacertomaternidadeagriness;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "GUID")
    private String guid;
    @Column(name = "CDENTIDADE")
    private Integer cdentidade;
    @Column(name = "CDNOTA")
    private Integer cdnota;
    @Column(name = "CDCAUSA")
    private Integer cdcausa;
    @Column(name = "CDGRANJA")
    private Integer cdgranja;
    @Column(name = "CDEMPRESA")
    private Integer cdempresa;
    @Column(name = "CDFASE")
    private Integer cdfase;
    @Column(name = "CDFUNCIONARIO")
    private Integer cdfuncionario;
    @Column(name = "CDLOTE")
    private Integer cdlote;
    @Column(name = "CDSALALOTE")
    private Integer cdsalalote;
    @Column(name = "CDSALALOTE2")
    private Integer cdsalalote2;

}
