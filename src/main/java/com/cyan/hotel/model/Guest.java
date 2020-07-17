package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.LoyatyLevel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "guest")
public class Guest extends User {

  @Column(name = "emailAddress", nullable = false)
  private String emailAddress;

  @Column(name = "phoneNumber", nullable = false)
  private String phoneNumber;

  @Enumerated(value = EnumType.STRING)
  @Column(name = "loyaltyLevel")
  private LoyatyLevel loyatyLevel;

  @OneToMany(mappedBy = "guest")
  private List<Payment> payments;

  public Guest() {

  }

  public Guest(Builder<?> builder) {
	super(builder);
	this.emailAddress = builder.emailAddress;
	this.phoneNumber = builder.phoneNumber;
  }

  public static Builder<?> builder() {
	return new Builder<Guest>() {
	  @Override
	  public Guest build() {
		return new Guest(this);
	  }
	};
  }

  public String getEmailAddress() {
	return emailAddress;
  }

  public String getPhoneNumber() {
	return phoneNumber;
  }

  public LoyatyLevel getLoyatyLevel() {
	return loyatyLevel;
  }

  public void setLoyatyLevel(LoyatyLevel loyatyLevel) {
	this.loyatyLevel = loyatyLevel;
  }

  public List<Payment> getPayments() {
	return payments;
  }

  public void setPayments(List<Payment> payments) {
	this.payments = payments;
  }

  public static abstract class Builder<T extends Guest> extends User.Builder<T> {

	private String emailAddress;
	private String phoneNumber;

	public Builder<T> emailAddress(String emailAddress) {
	  this.emailAddress = emailAddress;
	  return this;
	}

	public Builder<T> phoneNumber(String phoneNumber) {
	  this.phoneNumber = phoneNumber;
	  return this;
	}
  }
}
