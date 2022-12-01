package com.helha.FreshBread.controllers;

import com.helha.FreshBread.models.Bakery;
import com.helha.FreshBread.repositorys.RepoBakery;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bakery")
public class contRESTBakery {
    private final RepoBakery repository;
    contRESTBakery(RepoBakery repository) {
        this.repository = repository;
    }

    @GetMapping(produces = "application/json")
    public List getAllBakery(){
        return this.repository.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Optional<Bakery> getBakeryById(@PathVariable("id") long id){
        return this.repository.findById(id);
    }


    @PostMapping
    public Bakery postBakery(@RequestBody Bakery bakery){
        return this.repository.save(bakery);
    }

    @PutMapping(value = "/{id}")
    public Optional<Bakery> putBakeryById(@RequestBody Bakery bakery, @PathVariable("id") long id){

        return this.repository.findById(id)
                .map(newBakery -> {
                    newBakery.setName(bakery.getName());
                    newBakery.setAddress(bakery.getAddress());
                    newBakery.setUserId(bakery.getUserId());
                    return repository.save(newBakery);
                });
    }

    @DeleteMapping(value = "/{id}")
    public void deleteBakery(@PathVariable("id") long id){
        this.repository.deleteById(id);
    }
}
