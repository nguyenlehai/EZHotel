package com.cyan.hotel.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Booking {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Pattern(regexp = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2})")
  private String bookingDate;

  private Float bookingTotal;

  private String bookingCode;

  @Pattern(regexp = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}) ")
  private String checkInDate;

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
