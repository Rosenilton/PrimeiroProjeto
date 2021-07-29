package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.controller;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.AccessLevel;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service.AccessLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

                                        //Metodo do controller para Acess Level.

@RestController
@RequestMapping("/accesslevel")
public class AccessLevelController {

    @Autowired
    AccessLevelService accessLevelService;

    @PostMapping
    public AccessLevel createAccessLevel(@RequestBody AccessLevel accessLevel){
        return accessLevelService.save(accessLevel);
    }

    @GetMapping
    public List<AccessLevel> getAccessLevelList(){
        return accessLevelService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccessLevel> getAccessLevelByID(@PathVariable("id")Long id) throws Exception {
        return ResponseEntity.ok(accessLevelService.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public AccessLevel updateAccessLevel(@RequestBody AccessLevel accessLevel){
        return accessLevelService.update(accessLevel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AccessLevel> deleteAccessLevel (@PathVariable("id") Long id){
                accessLevelService.deleteAccessLevel(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}