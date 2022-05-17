package com.springfirebird.esanmatrizcompleta;

import com.springfirebird.esancobertura.Esancobertura;
import com.springfirebird.esanraca.Esanraca;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "ESANMATRIZ", catalog = "", schema = "")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class EsanmatrizCompleta implements Serializable {

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
    private Date nascimento;
    @Column(name = "DTENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entrada;
    @Column(name = "NUCICLOS")
    private Short ciclos;
    @Column(name = "CICLOENTRADA")
    private Short cicloentrada;
    @Column(name = "FLESTADOREPRODUTIVO")
    private String estadoreprodutivo;
    @Column(name = "FLSITUACAO")
    private String situacao;
    @Column(name = "FLMAEDELEITE")
    private String maeDeLeite;
    @Column(name = "DTPRIMEIRACOBERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date primeiraCobertura;
    @Column(name = "DTCOBERTCOMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date compra;
    @Column(name = "FLCOMPRAGESTANTE")
    private String compragestante;

    @JoinColumn(name = "cdraca")
    @ManyToOne(targetEntity = Esanraca.class)
    private Esanraca raca;

    @OneToMany(mappedBy = "cdmatriz")
    private List<Esancobertura> coberturas;

}
