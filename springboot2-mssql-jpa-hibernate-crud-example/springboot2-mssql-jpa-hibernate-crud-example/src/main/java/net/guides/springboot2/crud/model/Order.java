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



    public Order() {

    }

    public Order(long id,long numberOfOrder) {
        this.id = id;
        this.numberOfOrder = numberOfOrder;
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



    @Override
    public String toString() {
        return "Patient [id=" + id + ", numberOfOrder=" + numberOfOrder + " ]";
    }

}