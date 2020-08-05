package net.guides.springboot2.crud.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "store")
public class Store {
    @Id
    @Column(name="store_id",nullable = false)
    private long id;
    @Column(name = "storename", nullable = false)
    private String firstName;
    @Column(name = "storeaddress", nullable = false)
    private String address;
    @Column(name = "phonenumber", nullable = false)
    private long phone;


    public Store() {

    }

    public Store(String firstName, String address,long phone) {
        this.firstName = firstName;
        this.address = address;
        this.phone =phone;

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


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }



    @Override
    public String toString() {
        return "Store [id=" + id + ", firstName=" + firstName + ", address=" + address +
                ", phone=" + phone + " ]";
    }

}