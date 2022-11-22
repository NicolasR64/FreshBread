package com.helha.FreshBread.controllers;

import com.helha.FreshBread.models.Implantation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/implantation")
public class contRESTImplantation {

    //@Autowired
    //ISImplantation service;

    /*
    @GetMapping(produces = "application/json")
    public Implantation[] getAllImplantation(){
        return this.service.getAll();
    }
     */
    /*
    @GetMapping(value = "/{id}", produces = "application/json")
    public Implantation getImplantationById(){
        return this.service.get(@PathVariable("id"));
    }
    */

    /*
    @PostMapping
    public Implantation postImplantationById(@RequestBody Implantation implantation){
        return this.service.post(implantation);
    }
    */

    /*
    @PutMapping(value = "/{id}")
    public Implantation putImplantationById(@RequestBody Implantation implantation, @PathVariable("id") int id){
        return this.service.post(id, implantation);
    }
    */

    /*
    @DeleteMapping(value = "/{id}")
    public Implantation deleteImplantation(@PathVariable("id") int id){
        return this.service.delete(id);
    }
    */
}
