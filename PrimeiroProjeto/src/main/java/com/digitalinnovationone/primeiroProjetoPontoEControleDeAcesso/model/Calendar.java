package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

            //Tabela satélite do calendário.

public class Calendar {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}
