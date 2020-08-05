package net.guides.springboot2.crud.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "ordertable")
public class Order {
    @Id

    @Column(name="order_id",nullable = false)
    private long id;
    @Column(name = "numberoforder", nullable = false)
    private long numberOfOrder;
    @Column(name="patient_id",nullable = false)
    private int patientId;
    @Column(name="volunteer_id",nullable = false)
    private int volunteerId;
    @Column(name="item_id",nullable = false)
    private int itemId;


    public Order() {

    }

    public Order(long id,long numberOfOrder,int patientId,int volunteerId,int itemId) {
        this.id = id;
        this.numberOfOrder = numberOfOrder;
        this.patientId=patientId;
        this.volunteerId=volunteerId;
        this.itemId=itemId;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public long getNumberOfOrder() {
        return numberOfOrder;
    }
    public void setNumberOfOrder(long numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getVolunteerId() {
        return volunteerId;
    }
    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", numberOfOrder=" + numberOfOrder + " ,patient="+patientId+",volunteerId="+volunteerId+",itemId="+itemId+"]";
    }

}