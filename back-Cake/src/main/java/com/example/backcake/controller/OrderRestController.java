package com.example.backcake.controller;

import com.example.backcake.dao.OrderRepository;
import com.example.backcake.entity.Order;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RequestMapping("/orders")
@RestController
public class OrderRestController {
    private final OrderRepository orderRepository;
    @Autowired
    public OrderRestController(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }
    @GetMapping
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
    @PutMapping
    public Order update(@RequestBody Order order){
        if(orderRepository.existsById(order.getId())){
            return orderRepository.save(order);
        }
        throw new EntityExistsException("Order with id:'"+ order.getId() +"' doesn't exists");
    }
    @PostMapping
    public Order create(@RequestBody Order order){
        UUID id = order.getId();
        if(id !=null){
            if(orderRepository.existsById(order.getId())){
                throw new EntityExistsException("Order already exists");
            }
        }
        return orderRepository.save(order);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") UUID id){
        orderRepository.deleteById(id);
    }
}

