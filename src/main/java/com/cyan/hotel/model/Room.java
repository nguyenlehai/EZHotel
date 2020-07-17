package com.cyan.hotel.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity(name = "room")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Room {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "roomId")
  private Long roomId;

  @Column(name = "roomStatus", columnDefinition = "int default 0")
  @Pattern(regexp = "^[01]")
  private Integer roomStatus;

  @ManyToOne
  @JoinColumn(name = "bookingId")
  private Booking booking;

  @Column(name = "roomType")
  private String roomType;

  public Room() {
	this.roomStatus = 0;
  }

  public abstract Double getPrice();

  public abstract String getDescription();

  public Long getRoomId() {
	return roomId;
  }

  public void setRoomId(Long roomId) {
	this.roomId = roomId;
  }

  public Integer getRoomStatus() {
	return roomStatus;
  }

  public void setRoomStatus(Integer roomStatus) {
	this.roomStatus = roomStatus;
  }

  public Booking getBooking() {
	return booking;
  }

  public void setBooking(Booking booking) {
	this.booking = booking;
  }

  public String getRoomType() {
	return roomType;
  }

  public void setRoomType(String roomType) {
	this.roomType = roomType;
  }
}
