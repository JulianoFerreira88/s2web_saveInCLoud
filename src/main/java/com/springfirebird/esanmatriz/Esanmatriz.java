package com.springfirebird.esanmatriz;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springfirebird.esancobertura.Esancobertura;
import com.springfirebird.esandesmame.Esandesmame;
import com.springfirebird.esanparto.Esanparto;
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
import org.apache.commons.math3.util.Precision;

@Entity
@Table(name = "ESANMATRIZ", catalog = "", schema = "")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Esanmatriz implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final int PRECISION_SCALE = 2;
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
    @JsonIgnore
    private List<Esancobertura> coberturas;

    @OneToMany(mappedBy = "cdmatriz")
    @JsonIgnore
    private List<Esanparto> partos;

    @OneToMany(mappedBy = "cdmatriz")
    @JsonIgnore
    private List<Esandesmame> desmames;

    public double getTotalNascidos() {
        double total = 0.0;
        for (Esanparto parto : partos) {
            total += (parto.getNuvivo() + parto.getNunatimorto() + parto.getNumumificado() + parto.getNumortoaonascer());
        }
        return total;
    }

    public double getTotalNascidosVivos() {
        double total = 0.0;
        for (Esanparto parto : partos) {
            total += parto.getNuvivo();
        }
        return total;
    }

    public double getTotalNatimortos() {
        double total = 0.0;
        for (Esanparto parto : partos) {
            total += parto.getNunatimorto();
        }
        return total;
    }

    public double getTotalMumificados() {
        double total = 0.0;
        for (Esanparto parto : partos) {
            total += parto.getNumumificado();
        }
        return total;
    }

    public double getTotalMorteAoNascer() {
        double total = 0.0;
        for (Esanparto parto : partos) {
            total += parto.getNumortoaonascer();
        }
        return total;
    }

    public double getTotalBaixaViabilidade() {
        double total = 0.0;
        for (Esanparto parto : partos) {
            total += parto.getNuleitoesabaixo();
        }
        return total;
    }

    public double getTotalDesmamados() {
        double total = 0.0;
        for (Esandesmame desmame : desmames) {
            total += desmame.getDesmamados();
        }
        return total;
    }

    public double getMediaNascidos() {
        return Precision.round(getTotalNascidos() / partos.size(), PRECISION_SCALE);
    }

    public double getMediaNascidosVivos() {
        return getTotalNascidosVivos() / partos.size();
    }

    public double getMediaNatimortos() {
        return getTotalNatimortos() / partos.size();
    }

    public double getMediaMumificados() {
        return getTotalMumificados() / partos.size();
    }

    public double getMediaMorteAoNascer() {
        return getTotalMorteAoNascer() / partos.size();
    }

    public double getMediaBaixaViabilidade() {
        return getTotalBaixaViabilidade() / partos.size();
    }

    public double getMediaDesmamados() {
        return getTotalDesmamados() / desmames.size();
    }

    public double getPercentualNatimortos() {
        return (getTotalNatimortos() * 100) / getTotalNascidos();
    }

    public double getPercentualMumificados() {
        return (getTotalMumificados() * 100) / getTotalNascidos();
    }

    public double getPercentualMorteAoNascer() {
        return (getTotalMorteAoNascer() * 100) / getTotalNascidos();
    }

    public double getPercentualBaixaViabilidade() {
        return (getTotalBaixaViabilidade() * 100) / getTotalNascidosVivos();
    }

}
