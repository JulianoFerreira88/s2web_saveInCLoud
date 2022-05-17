package com.springfirebird.esanlote;

import com.springfirebird.esanmovanimais.Esanmovanimais;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "ESANLOTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Esanlote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDLOTE")
    private Integer cdlote;
    @Column(name = "NMLOTE")
    private String nmlote;
    @Column(name = "FLSITUACAO")
    private String flsituacao;
    @Column(name = "FLSITUACAO2")
    private String flsituacao2;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "DTMEDIANASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento;
    @Column(name = "DTMEDIANASCIMENTO2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmedianascimento2;
    @Column(name = "GUID")
    private String guid;
    @Column(name = "CDENTIDADE")
    private Integer cdentidade;
    @Column(name = "CDEMPRESA")
    private Integer cdempresa;
    @OneToMany(mappedBy = "cdlote", fetch = FetchType.EAGER)
//    @JsonIgnore
    private List<Esanmovanimais> movimetacoes;

//    public double getEntradaByDesmame() {
//        double total = 0.0;
//        for (Esanmovanimais d : getDesmames()) {
//            total += d.getQtanimais();
//        }
//        return total;
//    }
//
//    public double getSaldo() {
//        double saldo = 0.0;
//        for (Esanmovanimais m : movimetacoes) {
//            if (m.getCdfase() == 4) {
//                saldo += m.getQtanimais();
//            }
//        }
//        return saldo;
//    }
//
//    public int getDiasNaFase() {
//        return 0;
//    }
//
//    public List<Esanmovanimais> getDesmames() {
//        List<Esanmovanimais> desmames = new ArrayList<>();
//        getMovimetacoes().forEach(m -> {
//            if (m.getCdfase() == 4 && m.getFltipo().equals("D")) {
//                desmames.add(m);
//            }
//        });
//        return desmames;
//    }
//
//    public List<Esanmovanimais> getTransferenciasEntreLotes() {
//        List<Esanmovanimais> transferencias = new ArrayList<>();
//        getMovimetacoes().forEach(m -> {
//            if (m.getCdfase() == 4 && m.getFltipo().equals("L")) {
//                transferencias.add(m);
//            }
//        });
//        return transferencias;
//    }
//
//    public List<Esanmovanimais> getTransferenciasEntreFases() {
//        List<Esanmovanimais> transferencias = new ArrayList<>();
//        getMovimetacoes().forEach(m -> {
//            if (m.getCdfase() == 4 && m.getFltipo().equals("F")) {
//                transferencias.add(m);
//            }
//        });
//        return transferencias;
//    }
//
//    public List<Esanmovanimais> getMortes() {
//        List<Esanmovanimais> mortes = new ArrayList<>();
//        getMovimetacoes().forEach(m -> {
//            if (m.getCdfase() == 4 && m.getFltipo().equals("O")) {
//                mortes.add(m);
//            }
//        });
//        return mortes;
//    }

}
