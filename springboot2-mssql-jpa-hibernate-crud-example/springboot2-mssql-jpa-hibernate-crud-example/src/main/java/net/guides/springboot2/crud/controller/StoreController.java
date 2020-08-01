package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import net.guides.springboot2.crud.model.PatientOrderView;
import net.guides.springboot2.crud.model.StoreItemView;
import net.guides.springboot2.crud.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Store;

@RestController
@RequestMapping("/api/v1")
public class StoreController {
    @Autowired
    private StoreRepository storeRepository;

    @GetMapping("/store")
    public List<Store> getAllStore() {
        return storeRepository.findAll();
    }
    //@GetMapping("/StoreOrder/{StoreId}")
    //public List<StoreItemView>getAllItem(@PathVariable(value="storeId")Long storeId) {
      //  return storeRepository.findStoreItem(storeId);    }


    @GetMapping("/store/{store_id}")
    public ResponseEntity<Store> getStoreById(@PathVariable(value = "store_id") Long storeId)
            throws ResourceNotFoundException {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new ResourceNotFoundException("store not found for this id :: " + storeId));
        return ResponseEntity.ok().body(store);
    }

    @PostMapping("/store")
    public Store createStore( @RequestBody Store store) {
        return storeRepository.save(store);
    }

    @PutMapping("/store/{store_id}")
    public ResponseEntity<Store> updateStore(@PathVariable(value = "store_id") Long storeId,
                                                     @RequestBody Store storeDetails) throws ResourceNotFoundException {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new ResourceNotFoundException("store not found for this id :: " + storeId));


        store.setPhone(storeDetails.getPhone());
        store.setAddress(storeDetails.getAddress());
        store.setFirstName(storeDetails.getFirstName());
        final Store updatedStore = storeRepository.save(store);
        return ResponseEntity.ok(updatedStore);
    }

    @DeleteMapping("/store/{store_id}")
    public Map<String, Boolean> deletestore(@PathVariable(value = "store_id") Long storeId)
            throws ResourceNotFoundException {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new ResourceNotFoundException("store not found for this id :: " + storeId));

        storeRepository.delete(store);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}