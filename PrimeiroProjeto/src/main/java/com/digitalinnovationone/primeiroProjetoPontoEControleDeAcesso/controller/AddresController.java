package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.controller;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Addres;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service.AddresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

                                    //Metodo do controller para Addres.

@RestController
@RequestMapping("/addres")
public class AddresController {

    @Autowired
    AddresService addresService;

    @PostMapping
    public Addres createAddres(@RequestBody Addres addres){
        return addresService.save(addres);
    }

    @GetMapping
    public List<Addres> getAddresList(){
        return addresService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Addres> getAddresLevelByID(@PathVariable("id")Long id) throws Exception{
        return ResponseEntity.ok(addresService.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public Addres updateAddres(@RequestBody Addres addres){
        return addresService.update(addres);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Addres> deleteAddres(@PathVariable("id")Long id){
        addresService.deleteAddres(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
