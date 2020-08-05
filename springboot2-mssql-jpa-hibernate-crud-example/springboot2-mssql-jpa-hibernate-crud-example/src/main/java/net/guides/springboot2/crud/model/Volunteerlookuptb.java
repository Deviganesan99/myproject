package net.guides.springboot2.crud.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "volunteerlookuptb")
public class Volunteerlookuptb {
    @Id

    @Column(name="volunteerookuptb_id",nullable = false)
    private long id;
    @Column(name="volunteer_id",nullable = false)
    private int volunteerId;
    @Column(name="store_id",nullable = false)
    private int storeId;
    public Volunteerlookuptb() {

    }

    public Volunteerlookuptb(long id,int volunteerId,int storeId) {
        this.id = id;
        this.volunteerId=volunteerId;
        this.storeId=storeId;

    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getVolunteerId() {
        return volunteerId;
    }
    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }
    public int getstoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    @Override
    public String toString() {
        return "Patient [id=" + id + ",volunteerId="+volunteerId+",storeId="+storeId+" ]";
    }

}