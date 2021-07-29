package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;


import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Company;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

                                        //Metodo do service para Company.

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    public Company save(Company company){
        return companyRepository.save(company);
    }

    public List<Company> findAll(){
        return companyRepository.findAll();
    }

    public Optional<Company> findById(Long id){
        return companyRepository.findById(id);
    }

    public Company update(Company company){
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }
}
