package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.controller;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Company;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

                                        //Metodo do controller para Company.

@RestController
@RequestMapping("/company")
public class CompanyController {

        @Autowired
        CompanyService companyService;

        @PostMapping
        public Company createCompany(@RequestBody Company company){
            return companyService.save(company);
        }

        @GetMapping
        public List<Company> getCompanyList(){
            return companyService.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Company> getCompanyByID(@PathVariable("id")Long id) throws Exception{
            return ResponseEntity.ok(companyService.findById(id)
                    .orElseThrow(() -> new NoSuchElementException("Not Found!")));
        }

        @PutMapping
        public Company updateCompany(@RequestBody Company company){
            return companyService.update(company);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Company> deleteCompany(@PathVariable("id") Long id){
            companyService.deleteCompany(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
}
