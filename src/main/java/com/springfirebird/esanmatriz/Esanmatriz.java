package com.springfirebird.esanmatriz;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springfirebird.esancobertura.Esancobertura;
import com.springfirebird.esandesmame.Esandesmame;
import com.springfirebird.esanparto.Esanparto;
import com.springfirebird.esanraca.Esanraca;
import java.io.Serializable;
import java.util.ArrayList;
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
    @JsonIgnore
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
    private List<Esanparto> partos = new ArrayList<>();

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
        return Precision.round(getTotalNascidos() / getNumPartos() * 1.0, PRECISION_SCALE);
    }

    public double getMediaNascidosVivos() {
        double media = getTotalNascidosVivos() / getNumPartos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getMediaNatimortos() {
        double media = getTotalNatimortos() / getNumPartos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getMediaMumificados() {
        double media = getTotalMumificados() / getNumPartos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getMediaMorteAoNascer() {
        double media = getTotalMorteAoNascer() / getNumPartos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getMediaBaixaViabilidade() {
        double media = getTotalBaixaViabilidade() / getNumPartos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getMediaDesmamados() {
        double media = getTotalDesmamados() / getNumDesmames();
        return Precision.round(media, PRECISION_SCALE);

    }

    public double getPercentualNatimortos() {
        double media = (getTotalNatimortos() * 100) / getTotalNascidos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getPercentualMumificados() {
        double media = (getTotalMumificados() * 100) / getTotalNascidos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getPercentualMorteAoNascer() {
        double media = (getTotalMorteAoNascer() * 100) / getTotalNascidos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getPercentualBaixaViabilidade() {
        double media = (getTotalBaixaViabilidade() * 100) / getTotalNascidosVivos();
        return Precision.round(media, PRECISION_SCALE);
    }

    public double getNumPartos() {
        return partos.size() * 1.0;
    }

    public String getEstado() {
        if (estadoreprodutivo.equals("L")) {
            return "Lactante";
        } else if (estadoreprodutivo.equals("G")) {
            return "Gestante";
        } else {
            return "Vazia";
        }
    }

    public double getNumDesmames() {
        return desmames.size() * 1.0;
    }

}
