package net.guides.springboot2.crud.model;

public interface VolunteerOrderView {
    long getOrderId();
    long getNumberOfOrder();
    long getVolunteerId();
    long getItemId();
    String getVolunteerName();
    String getVolunteerAddress();
}

