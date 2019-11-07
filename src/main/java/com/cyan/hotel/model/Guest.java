package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.LoyatyLevel;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

@Entity
@Table(name = "guest")
@PrimaryKeyJoinColumn(name = "userId")
public class Guest extends User {

    @Transient
    private String passwordConfirm;
    private String emailAddress;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private LoyatyLevel loyatyLevel;

    public Guest() {
        super();
    }

    public Guest(String username, String password) {
        super(username, password);
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LoyatyLevel getLoyatyLevel() {
        return loyatyLevel;
    }

    public void setLoyatyLevel(LoyatyLevel loyatyLevel) {
        this.loyatyLevel = loyatyLevel;
    }
}