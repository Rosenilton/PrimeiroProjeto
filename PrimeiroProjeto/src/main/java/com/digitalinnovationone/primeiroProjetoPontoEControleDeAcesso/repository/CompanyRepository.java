package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
