package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Addres;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.AddresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddresService {

    @Autowired
    AddresRepository addresRepository;

    @Autowired
    public AddresService(AddresRepository addresRepository){
        this.addresRepository = addresRepository;
    }

    public Addres save(Addres addres) {
        return addresRepository.save(addres);
    }

    public List<Addres> findAll(){
        return addresRepository.findAll();
    }

    public Optional<Addres> findById(Long id){
        return addresRepository.findById(id);
    }

    public Addres update(Addres addres){
        return addresRepository.save(addres);
    }

    public void deleteAddres(Long id){
        addresRepository.deleteById(id);
    }
}
