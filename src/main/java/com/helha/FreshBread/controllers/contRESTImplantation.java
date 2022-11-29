package com.helha.FreshBread.controllers;

import com.helha.FreshBread.models.Implantation;
import com.helha.FreshBread.repositorys.RepoImplantation;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/implantation")
public class contRESTImplantation {

    private final RepoImplantation repository;
    contRESTImplantation(RepoImplantation repository) {
        this.repository = repository;
    }

    @GetMapping(produces = "application/json")
    public List getAllImplantation(){
        return this.repository.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Optional<Implantation> getImplantationById(@PathVariable("id") long id){
        return this.repository.findById(id);
    }


    @PostMapping
    public Implantation postImplantation(@RequestBody Implantation implantation){
        return this.repository.save(implantation);
    }

    @PutMapping(value = "/{id}")
    public Optional<Implantation> putImplantationById(@RequestBody Implantation newImplantation, @PathVariable("id") long id){

        return this.repository.findById(id)
                .map(implantation -> {
                    implantation.setName(newImplantation.getName());
                    implantation.setAddress(newImplantation.getAddress());
                    return repository.save(implantation);
                });
    }

    @DeleteMapping(value = "/{id}")
    public void deleteImplantation(@PathVariable("id") long id){
        this.repository.deleteById(id);
    }

}
