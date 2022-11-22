package com.helha.FreshBread.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class contRESTProduct {

    //@Autowired
    //ISProduct service;

    /*
    @GetMapping(produces = "application/json")
    public Product[] getAllProduct(){
        return this.service.getAll();
    }
     */
    /*
    @GetMapping(value = "/{id}", produces = "application/json")
    public Product getProductById(){
        return this.service.get(@PathVariable("id"));
    }
    */

    /*
    @PostMapping
    public Product postProductById(@RequestBody Product product){
        return this.service.post(product);
    }
    */

    /*
    @PutMapping(value = "/{id}")
    public Product putProductById(@RequestBody Product product, @PathVariable("id") int id){
        return this.service.put(id, product);
    }
    */

    /*
    @DeleteMapping(value = "/{id}")
    public Product deleteProduct(@PathVariable("id") int id){
        return this.service.delete(id);
    }
    */
}
