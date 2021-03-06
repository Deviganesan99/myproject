package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import net.guides.springboot2.crud.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Item;

@CrossOrigin(origins="http://localhost:3000",maxAge=3600)
@RestController
@RequestMapping("/api/v1")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/item")
    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }

    @GetMapping("/item/{item_id}")
    public ResponseEntity<Item> getItemById(@PathVariable(value = "item_id") Long itemId)
            throws ResourceNotFoundException {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("item not found for this id :: " + itemId));
        return ResponseEntity.ok().body(item);
    }

    @PostMapping("/item")
    public Item createItem( @RequestBody Item item) {
        return itemRepository.save(item);
    }

    @PutMapping("/item/{item_id}")
    public ResponseEntity<Item> updateItem(@PathVariable(value = "item_id") Long itemId,
                                             @RequestBody Item itemDetails) throws ResourceNotFoundException {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("item not found for this id :: " + itemId));


        itemDetails.setId(item.getId());

        return ResponseEntity.ok(itemRepository.save(itemDetails));
    }

    @DeleteMapping("/item/{item_id}")
    public Map<String, Boolean> deleteItem(@PathVariable(value = "item_id") Long itemId)
            throws ResourceNotFoundException {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("item not found for this id :: " + itemId));

        itemRepository.delete(item);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}