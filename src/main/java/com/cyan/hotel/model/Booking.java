package com.cyan.hotel.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
@Table(name = "booking")
public class Booking {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "bookingDate")
  @Pattern(regexp = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2})")
  private String bookingDate;

  @Column(name = "bookingTotal")
  private Float bookingTotal;

  @Column(name = "bookingCode")
  private String bookingCode;

  @Column(name = "checkInDate")
  @Pattern(regexp = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}) ")
  private String checkInDate;

  @Column(name = "checkOutDate")
  @Pattern(regexp = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}) ")
  private String checkOutDate;

  @ManyToMany
  Set<Room> rooms;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "guest_id", nullable = false, insertable = false, updatable = false)
  private Guest guest;

  public Booking() {

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


  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public String getBookingDate() {
	return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
  }

  public Float getBookingTotal() {
	return bookingTotal;
  }

  public void setBookingTotal(Float bookingTotal) {
	this.bookingTotal = bookingTotal;
  }

  public String getBookingCode() {
	return bookingCode;
  }

  public void setBookingCode(String bookingCode) {
	this.bookingCode = bookingCode;
  }

  public String getCheckInDate() {
	return checkInDate;
  }

  public void setCheckInDate(String checkInDate) {
	this.checkInDate = checkInDate;
  }

  public String getCheckOutDate() {
	return checkOutDate;
  }

  public void setCheckOutDate(String checkOutDate) {
	this.checkOutDate = checkOutDate;
  }

  public Set<Room> getRooms() {
	return rooms;
  }

  public void setRooms(Set<Room> rooms) {
	this.rooms = rooms;
  }

  public User getUser() {
	return user;
  }

  public void setUser(User user) {
	this.user = user;
  }

  public Guest getGuest() {
	return guest;
  }

  public void setGuest(Guest guest) {
	this.guest = guest;
  }
}
