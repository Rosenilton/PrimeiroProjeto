package com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.service;

import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.model.Location;
import com.digitalinnovationone.primeiroProjetoPontoEControleDeAcesso.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

                                        //Metodo do service para Location.

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    public Location save(Location location){
        return locationRepository.save(location);
    }

    public List<Location> findAll(){
        return locationRepository.findAll();
    }

    public Optional<Location> findById(Long id){
        return locationRepository.findById(id);
    }

    public Location update(Location location){
        return locationRepository.save(location);
    }

    public void deleteLocation(Long id){
        locationRepository.deleteById(id);
    }
}
