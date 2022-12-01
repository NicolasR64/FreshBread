package com.helha.FreshBread.controllers;


import com.helha.FreshBread.models.Product;
import com.helha.FreshBread.repositorys.RepoProduct;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class contRESTProduct {
    private final RepoProduct repository;
    contRESTProduct(RepoProduct repository) {
        this.repository = repository;
    }

    @GetMapping(produces = "application/json")
    public List getAllProduct(){
        return this.repository.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Optional<Product> getProductById(@PathVariable("id") long id){
        return this.repository.findById(id);
    }


    @PostMapping
    public Product postProduct(@RequestBody Product product){
        return this.repository.save(product);
    }

    @PutMapping(value = "/{id}")
    public Optional<Product> putProductById(@RequestBody Product product, @PathVariable("id") long id){

        return this.repository.findById(id)
                .map(newProduct -> {
                    newProduct.setName(product.getName());
                    newProduct.setPrice(product.getPrice());
                    newProduct.setQty(product.getQty());
                    newProduct.setDesc(product.getDesc());
                    newProduct.setPicture(product.getPicture());
                    return repository.save(newProduct);
                });
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable("id") long id){
        this.repository.deleteById(id);
    }
}
