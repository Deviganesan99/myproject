package net.guides.springboot2.crud.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @Column(name="patient_id",nullable = false)
    private long id;
    @Column(name = "patient_name", nullable = false)
    private String firstName;
    @Column(name = "patient_address", nullable = false)
    private String address;
    @Column(name = "patient_emailaddress", nullable = false)
    private String emailId;
    @Column(name = "patient_phonenumber", nullable = false)
    private long phone;
    @Column(name = "patient_password", nullable = false)
    private String password;


    public Patient() {

    }

    public Patient( long id ,String firstName, String address, String emailId, long phone,String password) {
        this.id=id;
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
        return "Patient [id=" + id + ", firstName=" + firstName + ", address=" + address + ", emailId=" + emailId
                + " , phone=" + phone + ",password = " + password  +"]";
    }

}