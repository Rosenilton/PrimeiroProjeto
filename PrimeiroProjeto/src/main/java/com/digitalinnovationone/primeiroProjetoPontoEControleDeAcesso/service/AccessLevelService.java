package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.AccessLevel;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.AccessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

                                                    //Metodo do Service para AccessLevel.

@Service
public class AccessLevelService {

    @Autowired
    AccessLevelRepository accessLevelRepository;

    @Autowired
    public AccessLevelService(AccessLevelRepository accessLevelRepository) {
        this.accessLevelRepository = accessLevelRepository;
    }

    public AccessLevel save(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }

    public List<AccessLevel> findAll() {
        return accessLevelRepository.findAll();
    }

    public Optional<AccessLevel> findById(Long id) {
        return accessLevelRepository.findById(id);
    }


    public AccessLevel update(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }


    public void deleteAccessLevel(Long id) {
        accessLevelRepository.deleteById(id);
    }
}
