package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import net.guides.springboot2.crud.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Order;

@CrossOrigin(origins="http://localhost:3000",maxAge=3600)
@RestController
@RequestMapping("/api/v1")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/ordertable")
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @GetMapping("/ordertable/{order_id}")
    public ResponseEntity<Order> getOrderById(@PathVariable(value = "order_id") Long orderId)
            throws ResourceNotFoundException {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("order not found for this id :: " + orderId));
        return ResponseEntity.ok().body(order);
    }

    @PostMapping("/ordertable")
    public Order createOrder( @RequestBody Order order) {
        return orderRepository.save(order);
    }

    @PutMapping("/ordertable/{order_id}")
    public ResponseEntity<Order> updateOrder(@PathVariable(value = "order_id") Long orderId,
                                           @RequestBody Order orderDetails) throws ResourceNotFoundException {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("order not found for this id :: " + orderId));


        orderDetails.setId(order.getId());

        return ResponseEntity.ok(orderRepository.save(orderDetails));
    }

    @DeleteMapping("/ordertable/{item_id}")
    public Map<String, Boolean> deleteOrder(@PathVariable(value = "order_id") Long orderId)
            throws ResourceNotFoundException {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("order not found for this id :: " + orderId));

        orderRepository.delete(order);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}