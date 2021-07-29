package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.controller;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Workday;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service.WorkdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;


                                        //Metodo do controller para Workday.

@RestController
@RequestMapping("/workday")
public class WorkdayController {

    @Autowired
    WorkdayService workdayService;

    @PostMapping
    public Workday createWorkday(@RequestBody Workday workday){
        return workdayService.save(workday);
    }

    @GetMapping
    public List<Workday> getWorkdayList(){
        return workdayService.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Workday> getWorkdayByID(@PathVariable("id") Long id) throws Exception {
        return  ResponseEntity.ok(workdayService.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public Workday updateWorkday(@RequestBody Workday workday){
        return workdayService.update(workday);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Workday> deleteWorkday (@PathVariable("id") Long id) {
                workdayService.deleteWorkday(id);
                return new ResponseEntity<> (HttpStatus.NO_CONTENT);

    }

}
