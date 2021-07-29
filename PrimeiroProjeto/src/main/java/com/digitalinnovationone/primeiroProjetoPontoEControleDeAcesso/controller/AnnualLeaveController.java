package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.controller;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.AnnualLeave;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service.AnnualLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

                                                    //Metodo do controller para AnnualLeave.

@RestController
@RequestMapping("/annualleave")
public class AnnualLeaveController {

    @Autowired
    AnnualLeaveService annualLeaveService;

    @PostMapping
    public AnnualLeave createAnnualLeave(@RequestBody AnnualLeave annualLeave){
            return annualLeaveService.save(annualLeave);
    }

    @GetMapping
    public List<AnnualLeave> getAnnualLeavelist(){
        return annualLeaveService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnualLeave> getAnnualLeaveByID(@PathVariable("id")Long id) throws Exception{
        return ResponseEntity.ok(annualLeaveService.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public AnnualLeave updateAnnualLeave(@RequestBody AnnualLeave annualLeave){
        return annualLeaveService.update(annualLeave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AnnualLeave> deleteAnnualLeave(@PathVariable("id")Long id){
        annualLeaveService.deleteAnnualLeave(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
