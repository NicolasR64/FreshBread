package com.helha.FreshBread.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class contRESTOrder {

    //@Autowired
    //ISOrder service;

    /*
    @GetMapping(produces = "application/json")
    public Order[] getAllOrder(){
        return this.service.getAll();
    }
     */
    /*
    @GetMapping(value = "/{id}", produces = "application/json")
    public Order getOrderById(){
        return this.service.get(@PathVariable("id"));
    }
    */

    /*
    @PostMapping
    public Order postOrderById(@RequestBody Order order){
        return this.service.post(order);
    }
    */

    /*
    @PutMapping(value = "/{id}")
    public Order putOrderById(@RequestBody Order order, @PathVariable("id") int id){
        return this.service.put(id, order);
    }
    */

    /*
    @DeleteMapping(value = "/{id}")
    public Order deleteOrder(@PathVariable("id") int id){
        return this.service.delete(id);
    }
    */
}
