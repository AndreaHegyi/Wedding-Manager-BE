package com.example.WeddingPlanner.vendordata;

import com.example.WeddingPlanner.appuser.AppUser;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class VendorData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String vendorName;
    private String vendorEmail;
    private String vendorPhone;
    private String vendorLocation;
    private String vendorImageURL;
    private String vendorDescription;
    @OneToMany
    @Nullable
    private List<AppUser> appUsers;

    public Integer getId() {
        return id;
    }

    public String getVendorName(){
        return vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public String getVendorLocation() {
        return vendorLocation;
    }

    public String getVendorImageURL() {
        return vendorImageURL;
    }

    public String getVendorDescription(){
        return vendorDescription;
    }

    public List<AppUser> getAppUsers(){
        return appUsers;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public void setVendorLocation(String vendorLocation) {
        this.vendorLocation = vendorLocation;
    }

    public void setVendorImageURL(String vendorImageURL) {
        this.vendorImageURL = vendorImageURL;
    }

    public void setVendorDescription(String vendorDescription) {
        this.vendorDescription = vendorDescription;
    }

    public void setAppUsers(List<AppUser> appUsers) {
        this.appUsers = appUsers;
    }

    public VendorData(){

    }

    public VendorData(Integer id, String vendorName, String vendorEmail, String vendorPhone, String vendorLocation, String vendorImageURL, String vendorDescription, List<AppUser> appUsers){
        this.id = id;
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.vendorPhone = vendorPhone;
        this.vendorLocation = vendorLocation;
        this.vendorImageURL = vendorImageURL;
        this.vendorDescription = vendorDescription;
        this.appUsers = appUsers;
    }
}
