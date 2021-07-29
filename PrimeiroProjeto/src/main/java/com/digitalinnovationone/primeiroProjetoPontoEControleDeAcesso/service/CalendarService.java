package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Calendar;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

                                //Metodo do service para Calendar.

@Service
public class CalendarService {

    @Autowired
    CalendarRepository calendarRepository;

    @Autowired
    public CalendarService(CalendarRepository calendarRepository){
        this.calendarRepository = calendarRepository;
    }

    public Calendar save(Calendar calendar){
        return calendarRepository.save(calendar);
    }

    public List<Calendar> findAll(){
        return calendarRepository.findAll();
    }

    public Optional<Calendar> findById(Long id){
        return calendarRepository.findById(id);
    }

    public Calendar update(Calendar calendar){
        return calendarRepository.save(calendar);
    }

    public void deleteCalendar(Long id){
        calendarRepository.deleteById(id);
    }
}

