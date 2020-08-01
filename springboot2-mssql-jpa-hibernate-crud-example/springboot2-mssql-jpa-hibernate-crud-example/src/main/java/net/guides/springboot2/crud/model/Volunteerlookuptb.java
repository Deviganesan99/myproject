package net.guides.springboot2.crud.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "volunteerlookuptb")
public class Volunteerlookuptb {
    @Id

    @Column(name="volunteerookuptb_id",nullable = false)
    private long id;

    public Volunteerlookuptb() {

    }

    public Volunteerlookuptb(long id) {
        this.id = id;

    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Patient [id=" + id + " ]";
    }

}