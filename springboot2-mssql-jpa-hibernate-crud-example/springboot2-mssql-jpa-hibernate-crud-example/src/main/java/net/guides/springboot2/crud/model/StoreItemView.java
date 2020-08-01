package net.guides.springboot2.crud.model;

public interface StoreItemView {
    long getItemId();
    long getNumberOfItem();
    long getItemPrice();
    String getItemName();
    String getStoreName();
    String getStoreAddress();

}

