package net.guides.springboot2.crud.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "volunteer")
public class Volunteer {
    @Id

    @Column(name="volunteer_id",nullable = false)
    private long id;
    @Column(name = "volunteer_name", nullable = false)
    private String firstName;
    @Column(name = "volunteer_address", nullable = false)
    private String address;
    @Column(name = "volunteer_emailaddress", nullable = false)
    private String emailId;
    @Column(name = "volunteer_phonenumber", nullable = false)
    private long phone;
    @Column(name = "volunteer_password", nullable = false)
    private String password;


    public Volunteer() {

    }

    public Volunteer(String firstName, String address, String emailId, long phone,String password) {
        this.firstName = firstName;
        this.address = address;
        this.emailId = emailId;
        this.phone =phone;
        this.password = password;
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


    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Volunteer [id=" + id + ", firstName=" + firstName + ", address=" + address + ", emailId=" + emailId
                + " , phone=" + phone + ",password = " + password  +"]";
    }

}