package com.atos.firstbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "Tbl_Profiles")
public class Profile {
    @Id
    @Column(name = "IdProfile")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProfile;
    @Column(name = "Profile")
    private String profile;

    public int getIdProfile() {
        return this.idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
