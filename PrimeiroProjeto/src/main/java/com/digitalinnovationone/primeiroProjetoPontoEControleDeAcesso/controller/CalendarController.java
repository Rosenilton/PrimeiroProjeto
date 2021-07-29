package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.controller;


import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Calendar;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

                                                //Metodo do controller para Calendar.

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @Autowired
    CalendarService calendarService;

    @PostMapping
    public Calendar createCalendar(@RequestBody Calendar calendar){
        return calendarService.save(calendar);
    }

    @GetMapping
    public List<Calendar> getCalendarList(){
        return calendarService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendar> getCalendarByID(@PathVariable("id")Long id) throws Exception{
        return ResponseEntity.ok(calendarService.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Not Found!")));
    }

    @PutMapping
    public Calendar updateCalendar(@RequestBody Calendar calendar){
        return calendarService.update(calendar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Calendar> deleteCalendar(@PathVariable("id") Long id){
        calendarService.deleteCalendar(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
