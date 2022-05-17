package com.springfirebird.esanlote;

import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsanloteDao extends JpaRepository<Esanlote, Integer> {

    public default List<Esanlote> findLotesCreche() {
        return this.findBySituacao("4");
    }

    public default List<Esanlote> findLotesterminacao() {
        return this.findBySituacao("6");
    }

    public default List<Esanlote> findBySituacao(String situacao) {
        Esanlote l = new Esanlote();
        l.setFlsituacao(situacao);
        return this.findAll(Example.of(l));
    }

    public default Esanlote getLoteCreche(Integer id) {
        Esanlote lote = new Esanlote();
        lote.setFlsituacao("4");
        lote.setCdlote(id);
        return this.findOne(Example.of(lote)).get();
    }
}
