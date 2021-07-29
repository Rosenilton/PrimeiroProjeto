package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.controller;


import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Occurrence;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

                                                        //Metodo do controler para Occurrence.

@RestController
@RequestMapping("/occurrence")
public class OccurrenceController {

    @Autowired
    OccurrenceService occurrenceService;

    @PostMapping
    public Occurrence createOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.save(occurrence);
    }

    @GetMapping
    public List<Occurrence> getOccurrenceList(){
        return occurrenceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Occurrence> getOccurrenceByID(@PathVariable("id")Long id) throws Exception{
        return ResponseEntity.ok(occurrenceService.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Not Found!")));
    }

    @PutMapping
    public Occurrence updateOccurrence(@RequestBody Occurrence occurrence){
        return occurrenceService.update(occurrence);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Occurrence> deleteOccurrence(@PathVariable("id") Long id){
        occurrenceService.deleteOccurrence(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
