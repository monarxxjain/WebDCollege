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

    @Column
    private int isLoggedInWhileSup;


    public UserData() {
    }

    public UserData(int userId, String userName, String emailId, String password, String fav_animal, int isLoggedInWhileSup) {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.fav_animal = fav_animal;
        this.isLoggedInWhileSup = isLoggedInWhileSup;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getIsLoggedInWhileSup() {
        return this.isLoggedInWhileSup;
    }

    public void setIsLoggedInWhileSup(int isLoggedInWhileSup) {
        this.isLoggedInWhileSup = isLoggedInWhileSup;
    }
    

}
