package com.cyan.hotel.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Observer;

@Entity
public class Booking {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long bookingId;


  @Pattern(regexp = "dd/MM/yyyy")
  private String bookingDate;


  private Integer numberOfGuests;


  private Double bookingTotal;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "guest_id", nullable = false, insertable = false, updatable = false)
  private Guest guest;

  @Transient
  private Observer observer;

  public Booking() {

  }

  public Observer getObserver() {
	return observer;
  }

//    public void setBookingTotal(Observer observer, Integer newBookingTotal) {
//        int result = bookingTotal.compareTo(newBookingTotal);
//        if(result==-1){
//            this.observer = observer;
//            this.bookingTotal = newBookingTotal;
//            setChanged();
//            notifyObservers();
//        }
//    }

  public void setBookingId(Long bookingId) {
	this.bookingId = bookingId;
  }

  public Long getBookingId() {
	return bookingId;
  }

  public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
  }

  public Integer getNumberOfGuests() {
	return numberOfGuests;
  }

  public void setNumberOfGuests(Integer numberOfGuests) {
	this.numberOfGuests = numberOfGuests;
  }

  public String getBookingDate() {
	return bookingDate;
  }

  public User getUser() {
	return user;
  }

  public void setUser(User user) {
	this.user = user;
  }

  public void setBookingTotal(Double bookingTotal) {
	this.bookingTotal = bookingTotal;
  }

  public Double getBookingTotal() {
	return bookingTotal;
  }
}
