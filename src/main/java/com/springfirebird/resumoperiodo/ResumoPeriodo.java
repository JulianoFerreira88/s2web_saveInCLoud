package com.springfirebird.resumoperiodo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springfirebird.esancobertura.Esancobertura;
import com.springfirebird.esandesmame.Esandesmame;
import com.springfirebird.esanmovanimais.Esanmovanimais;
import com.springfirebird.esanparto.Esanparto;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ResumoPeriodo implements Serializable {

    private String inicio;
    private String fim;
    @JsonIgnore
    private List<Esanmovanimais> movimentacoes;
    
    private List<Esanparto> partos;
    @JsonIgnore
    private List<Esancobertura> coberturas;
    
    private List<Esandesmame> desmames;

}
