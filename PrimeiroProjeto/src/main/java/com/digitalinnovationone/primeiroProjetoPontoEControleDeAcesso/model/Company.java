package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

            //Tabela satélite da empresa.

public class Company {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String cnpj;

    @OneToOne
    private Addres address;
}