package net.guides.springboot2.crud.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name="item_id",nullable = false)
    private long id;
    @Column(name = "itemname", nullable = false)
    private String firstName;
    @Column(name = "numberofitem", nullable = false)
    private int numberOfItem;
    @Column(name = "item_price", nullable = false)
    private long itemPrice;
    @Column(name = "store_id", nullable = false)
    private int storeId;

    public Item() {

    }

    public Item(String firstName, int numberOfItem,long itemPrice,int storeId) {
        this.firstName = firstName;
        this.numberOfItem = numberOfItem;
        this.itemPrice= itemPrice;
        this.storeId =storeId;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public int getNumberOfItem() {
        return numberOfItem;
    }
    public void setNumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public long getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", firstName=" + firstName +",numberOfItem=" + numberOfItem +",itemPrice ="+itemPrice+",storeId="+storeId + "]";
    }

}