package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.controller;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.DateType;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service.DateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

                                                //Metodo do controler para DateType

@RestController
@RequestMapping("/datetype")
public class DateTypeController {

    @Autowired
    DateTypeService dateTypeService;

    @PostMapping
    public DateType createDateType(@RequestBody DateType dateType){
        return dateTypeService.save(dateType);
    }

    @GetMapping
    public List<DateType> getDateTypeList(){
        return dateTypeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DateType> getDateTypeByID(@PathVariable("id")Long id) throws Exception{
        return ResponseEntity.ok(dateTypeService.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Not Found!")));
    }

    @PutMapping
    public DateType updateDateType(@RequestBody DateType dateType){
        return dateTypeService.update(dateType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DateType> deleteDateType(@PathVariable("id") Long id){
        dateTypeService.deleteDatetype(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
