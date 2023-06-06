package com.hello.hewwbf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class AdminData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int adId;

    @Column
    private String adminName;

    @Column
    private String adminEmail;

    @Column
    private String adminPassword;

    @Column
    private String adminID;

    public AdminData() {

    }

    public AdminData(int adId, String adminName, String adminEmail, String adminPassword, String adminID) {

        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
        this.adminID = adminID;
    }



    public int getAdId() {
        return this.adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getAdminName() {
        return this.adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return this.adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return this.adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminID() {
        return this.adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

}
