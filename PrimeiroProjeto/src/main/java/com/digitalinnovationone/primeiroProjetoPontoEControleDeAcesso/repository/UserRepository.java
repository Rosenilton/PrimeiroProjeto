package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
