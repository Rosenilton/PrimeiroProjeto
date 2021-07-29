package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;


import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.DateType;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.DateTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

                                //Metoro do service para DateRype.

@Service
public class DateTypeService {


    @Autowired
    DateTypeRepository dateTypeRepository;

    @Autowired
    public DateTypeService(DateTypeRepository dateTypeRepository){
        this.dateTypeRepository = dateTypeRepository;
    }

    public DateType save(DateType dateType){
        return dateTypeRepository.save(dateType);
    }

    public List<DateType> findAll(){
        return dateTypeRepository.findAll();
    }

    public Optional<DateType> findById(Long id){
        return dateTypeRepository.findById(id);
    }

    public DateType update(DateType dateType){
        return dateTypeRepository.save(dateType);
    }

    public void deleteDatetype(Long id){
        dateTypeRepository.deleteById(id);
    }
}
