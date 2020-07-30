package com.cyan.hotel.requestForm;

import java.util.List;

public class BookingForm {

  private String bookingCode;

  private List<String> rooms;

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
