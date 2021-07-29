package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Workday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkdayRepository extends JpaRepository<Workday, Long> {
}
