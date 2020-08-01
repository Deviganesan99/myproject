package net.guides.springboot2.crud.repository;




import net.guides.springboot2.crud.model.StoreItemView;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import net.guides.springboot2.crud.model.Store;

import java.util.ArrayList;


@Repository

public interface StoreRepository extends JpaRepository<Store, Long>{
    @Query(value="select O.item_id as itemId, O.numberofitem as numberOfItem, O.item_price as itemPrice,  C.storename as storeName, C.storeaddress as storeAddress\n" +
            "from item O\n" +
            "INNER JOIN store c\n" +
            "ON  O.store_id = C.store_id\n" +
            "where O.store_id =:store_id", nativeQuery = true)
    ArrayList<StoreItemView>findPatientOrder(@Param("store_id") long storeId);

}