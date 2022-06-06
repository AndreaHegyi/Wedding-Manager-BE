package com.example.WeddingPlanner.registration;

import com.example.WeddingPlanner.appuser.AppUserRole;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String location;
    private final AppUserRole appUserRole;

    public RegistrationRequest(String firstName, String lastName, String email, String password, String location, AppUserRole appUserRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.location = location;
        this.appUserRole = appUserRole;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLocation(){
        return location;
    }

    public AppUserRole getAppUserRole() {
        return appUserRole;
    }
}
