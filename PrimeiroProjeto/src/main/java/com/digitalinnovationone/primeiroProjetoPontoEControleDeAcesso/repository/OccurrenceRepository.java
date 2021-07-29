package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccurrenceRepository extends JpaRepository<Occurrence, Long> {
}
