package com.helha.FreshBread.controllers;

import com.helha.FreshBread.models.Order;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class contRESTOrder{
    /*private final RepoOrder repository;
    contRESTOrder(RepoOrder repository) {
        this.repository = repository;
    }

    @GetMapping(produces = "application/json")
    public List getAllOrder(){
            return this.repository.findAll();
            }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Optional<Order> getOrderById(@PathVariable("id") long id){
            return this.repository.findById(id);
            }


    @PostMapping
    public Order postOrder(@RequestBody Order order){
            return this.repository.save(order);
            }

    @PutMapping(value = "/{id}")
    public Optional<Order> putOrderById(@RequestBody Order order, @PathVariable("id") long id){

            return this.repository.findById(id)
            .map(newOrder -> {
                newOrder.setId(id);
                newOrder.setDate(order.getDate());
                newOrder.setImplantation(order.getImplantation());
                newOrder.setProducts(order.getProducts());
                newOrder.setState(order.getState());
                newOrder.setUserId(order.getUserId());
            return repository.save(newOrder);
            });
            }

    @DeleteMapping(value = "/{id}")
    public void deleteOrder(@PathVariable("id") long id){
            this.repository.deleteById(id);
            }
    }*/
}