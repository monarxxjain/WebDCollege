package com.hello.hewwbf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "contactus")
public class ContactData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;

    @Column
    private String firstName;

    @Column
    private String emailAdd;

    @Column
    private String phno;

    @Column
    private String message;

    public ContactData() {

    }

    public ContactData(int userId, String firstName, String emailAdd, String phno, String message) {
        
        this.firstName = firstName;
        this.emailAdd = emailAdd;
        this.phno = phno;
        this.message = message;
    }


    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAdd() {
        return this.emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getPhno() {
        return this.phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
