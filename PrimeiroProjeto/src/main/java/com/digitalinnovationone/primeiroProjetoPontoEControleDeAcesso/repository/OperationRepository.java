package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}
