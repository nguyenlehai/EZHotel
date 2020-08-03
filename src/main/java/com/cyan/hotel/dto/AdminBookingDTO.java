package com.cyan.hotel.dto;

import java.util.List;

public class AdminBookingDTO {
  private long id;
  private String bookingCode;
  private List<String> rooms;

  public AdminBookingDTO(long id, String bookingCode, List<String> rooms) {
    this.id = id;
    this.bookingCode = bookingCode;
    this.rooms = rooms;
  }

  public AdminBookingDTO() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBookingCode() {
    return bookingCode;
  }

  public void setBookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
  }

  public List<String> getRooms() {
    return rooms;
  }

  public void setRooms(List<String> rooms) {
    this.rooms = rooms;
  }
}
