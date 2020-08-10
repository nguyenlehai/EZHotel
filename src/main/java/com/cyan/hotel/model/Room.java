package com.cyan.hotel.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "room")
public class Room {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String roomDescription;

  private String roomImage;

  private Long roomPrice;

  @ManyToOne
  @JoinColumn(name = "room_type_id", nullable = false, insertable = false, updatable = false)
  private RoomType room_type;

  @OneToMany(mappedBy = "room", orphanRemoval = true, cascade = CascadeType.ALL)
  Set<BookingRoom> bookingRooms;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRoomDescription() {
    return roomDescription;
  }

  public void setRoomDescription(String roomDescription) {
    this.roomDescription = roomDescription;
  }

  public Long getRoomPrice() {
    return roomPrice;
  }

  public void setRoomPrice(Long roomPrice) {
    this.roomPrice = roomPrice;
  }

  public String getRoomImage() {
    return roomImage;
  }

  public void setRoomImage(String roomImage) {
    this.roomImage = roomImage;
  }

  public RoomType getRoom_type() {
    return room_type;
  }

  public void setRoom_type(RoomType room_type) {
    this.room_type = room_type;
  }

  public Set<BookingRoom> getBookingRooms() {
    return bookingRooms;
  }

  public void setBookingRooms(Set<BookingRoom> bookingRooms) {
    this.bookingRooms = bookingRooms;
  }
}
