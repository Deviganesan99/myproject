package net.guides.springboot2.crud.model;

public interface PatientOrderView {
   long getOrderId();
   long getNumberOfOrder();
    long getVolunteerId();
    long getItemId();
    String getPatientName();
    String getPatientAddress();
}

