package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

            //Tabela satélite do usuário.

public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private UserCategory userCategory;

    @ManyToOne
    private Company company;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private Workday workday;
    private BigDecimal tolerance;
    private LocalDateTime startJourney;
    private LocalDateTime endJourney;
}
