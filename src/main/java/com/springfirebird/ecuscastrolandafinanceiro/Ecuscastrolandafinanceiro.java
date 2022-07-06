package com.springfirebird.ecuscastrolandafinanceiro;

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
@Table(name = "ECUSCASTROLANDAFINANCEIRO", catalog = "", schema = "")
@XmlRootElement
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Ecuscastrolandafinanceiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDCASTROLANDAFINANCEIRO")
    private Integer cdcastrolandafinanceiro;
    @Column(name = "DTLANCAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtlancamento;
    @Column(name = "CDEMPRESA")
    private Integer cdempresa;
    @Column(name = "CDCONTAFINANCEIRA")
    private Integer cdcontafinanceira;
    @Column(name = "NMPRODUTO")
    private String nmproduto;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Column(name = "VALORTOTAL")
    private Integer valortotal;
    @Column(name = "CDENTIDADE")
    private Integer cdentidade;
    @Column(name = "NUNOTA")
    private String nunota;
    @Column(name = "NUSERIE")
    private String nuserie;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "FLIMPORTACASTROLANDA")
    private String flimportacastrolanda;
    @Column(name = "DTREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtregistro;
    @Column(name = "VOLUME")
    private Integer volume;

}
