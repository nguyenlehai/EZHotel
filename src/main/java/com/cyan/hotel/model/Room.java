package com.cyan.hotel.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "room")
public abstract class Room {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String room_name;

  private String room_image;

  private Float room_price;

  @ManyToOne
  @JoinColumn(name = "room_type_id", nullable = false, insertable = false, updatable = false)
  private RoomType room_type;

  @ManyToMany(mappedBy = "rooms")
  Set<Booking> bookings;

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public String getRoom_name() {
	return room_name;
  }

  public void setRoom_name(String room_name) {
	this.room_name = room_name;
  }

  public Float getRoom_price() {
	return room_price;
  }

  public void setRoom_price(Float room_price) {
	this.room_price = room_price;
  }

  public String getRoom_image() {
	return room_image;
  }

  public void setRoom_image(String room_image) {
	this.room_image = room_image;
  }

  public RoomType getRoom_type() {
	return room_type;
  }

  public void setRoom_type(RoomType room_type) {
	this.room_type = room_type;
  }

  public Set<Booking> getBookings() {
	return bookings;
  }

  public void setBookings(Set<Booking> bookings) {
	this.bookings = bookings;
  }
}
