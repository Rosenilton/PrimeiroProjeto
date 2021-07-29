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

                //Tabela satélite da movimentação.

public class Operation {

        @Id
        @GeneratedValue
        private long id;

        @OneToOne
        private User user;

        private LocalDateTime dateEntry;
        private LocalDateTime dateOut;
        private BigDecimal workTime;

        @ManyToOne
        private Occurrence occurrence;

        @ManyToOne
        private Calendar calendar;
}
