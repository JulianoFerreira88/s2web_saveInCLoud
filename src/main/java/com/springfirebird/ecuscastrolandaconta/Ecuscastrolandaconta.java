package com.springfirebird.ecuscastrolandaconta;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ECUSCASTROLANDACONTA", catalog = "", schema = "")
@XmlRootElement
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Ecuscastrolandaconta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CDCONTA")
    private Integer cdconta;
    @Column(name = "NMCONTA")
    private String nmconta;
    @Column(name = "CDGRUPOCONTA")
    private Integer cdgrupoconta;
    @Column(name = "FLTIPOCONTA")
    private String fltipoconta;

}
