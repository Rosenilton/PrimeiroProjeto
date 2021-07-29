package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.AnnualLeave;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.AnnualLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

                                                        //Metodo do service para AnnualLeave.

@Service
public class AnnualLeaveService {

    @Autowired
    AnnualLeaveRepository annualLeaveRepository;

    @Autowired
    public AnnualLeaveService(AnnualLeaveRepository annualLeaveRepository){
        this.annualLeaveRepository = annualLeaveRepository;
    }

    public AnnualLeave save(AnnualLeave annualLeave){
        return annualLeaveRepository.save(annualLeave);
    }

    public List<AnnualLeave> findAll(){
        return annualLeaveRepository.findAll();
    }

    public Optional<AnnualLeave> findById(Long id){
        return annualLeaveRepository.findById(id);
    }

    public AnnualLeave update(AnnualLeave annualLeave){
        return annualLeaveRepository.save(annualLeave);
    }

    public void deleteAnnualLeave(Long id){
        annualLeaveRepository.deleteById(id);
    }
}
