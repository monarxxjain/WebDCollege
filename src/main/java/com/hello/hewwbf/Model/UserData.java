package com.hello.hewwbf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;

    @Column
    private String userName;

    @Column
    private String emailId;

    @Column
    private String password;

    @Column
    private String fav_animal;

    public UserData() {

    }

    public UserData( String userName, String emailId, String password, String fav_animal) {

        this.password = password;
        this.fav_animal = fav_animal;
        this.userName = userName;
        this.emailId = emailId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFav_animal() {
        return this.fav_animal;
    }

    public void setFav_animal(String fav_animal) {
        this.fav_animal = fav_animal;
    }

}
