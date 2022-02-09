package com.atos.firstbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "Tbl_Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "Password")
    private String password;
    @Column(name = "IdProfile")
    private int idProfile;
    @Column(name = "IdEmployee")
    private int idEmployee;
    @Column(name = "Status")
    private String status;
    @Column(name = "CreatedDate")
    private String createdDate;
    @Column(name = "UpdatedDate")
    private String updatedDate;
    @Column(name = "Login")
    private boolean login;

    public int getIdUser() {
        return this.idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdProfile() {
        return this.idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }

    public int getIdEmployee() {
        return this.idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean isLogin() {
        return this.login;
    }

    public boolean getLogin() {
        return this.login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}