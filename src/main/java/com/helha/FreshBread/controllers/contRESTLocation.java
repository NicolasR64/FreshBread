package com.helha.FreshBread.controllers;

import com.helha.FreshBread.models.Location;
import com.helha.FreshBread.repositorys.RepoLocation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/location")
public class contRESTLocation {

    private final RepoLocation repository;
    contRESTLocation(RepoLocation repository) {
        this.repository = repository;
    }

    @GetMapping(produces = "application/json")
    public List getAllLocation(){
        return this.repository.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Optional<Location> getLocationById(@PathVariable("id") long id){
        return this.repository.findById(id);
    }


    @PostMapping
    public Location postLocation(@RequestBody Location location){
        return this.repository.save(location);
    }

    @PutMapping(value = "/{id}")
    public Optional<Location> putLocationById(@RequestBody Location newLocation, @PathVariable("id") long id){

        return this.repository.findById(id)
                .map(location -> {
                    location.setName(newLocation.getName());
                    location.setAddress(newLocation.getAddress());
                    return repository.save(location);
                });
    }

    @DeleteMapping(value = "/{id}")
    public void deleteLocation(@PathVariable("id") long id){
        this.repository.deleteById(id);
    }

}
