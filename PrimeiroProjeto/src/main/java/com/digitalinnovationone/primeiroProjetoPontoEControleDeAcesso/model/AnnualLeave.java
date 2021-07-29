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

            //Tabela satélite de banco de horas.

public class AnnualLeave {

   @Id
   @GeneratedValue
   private long id;

   @OneToOne
   private User user;

   private LocalDateTime workDay;
   private BigDecimal workedHours;
   private BigDecimal hoursBalance;

}
