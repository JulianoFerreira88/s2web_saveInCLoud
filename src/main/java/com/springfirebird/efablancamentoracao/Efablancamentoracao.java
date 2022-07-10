package com.springfirebird.efablancamentoracao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
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
@Table(catalog = "", schema = "")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Efablancamentoracao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer cdlancamentoracao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Temporal(TemporalType.DATE)
    private Date dtlancamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal qtracao;
    private String fltipolancamento;
    private BigDecimal vlcustoatual;
    private BigDecimal vlunitario;
    private String flgeradoautomatico;
    private String deobservacao;
    private String nmlote;
    @Temporal(TemporalType.DATE)
    private Date dtfabricacao;
    @Temporal(TemporalType.DATE)
    private Date dtvalidade;
    private BigDecimal vlcustoultcompra;
    private Integer cdloteproducao;
    private BigDecimal vltotal;
    private String flimportacastrolanda;
    private Double vlproducaomediaponderada;
    private Double vlproducaoultimacompra;
    private String guid;
    private Integer cdentidade;
    private Integer cdnota;
    private Integer cdacertoestoque;
    private Integer cdcomposicaoracao;
    private Integer cdracao;
    @Basic(optional = false)
    private int cdempresa;
    private Integer cdoutraempresa;
    private Integer cdfase;
    private Integer cdlote;

}
