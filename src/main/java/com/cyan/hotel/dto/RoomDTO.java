package com.cyan.hotel.dto;

public class RoomDTO {
  private Long id;
  private String roomName;
  private String roomImage;
  private Long roomPrice;

  public RoomDTO(Long id, String roomName, String roomImage, Long roomPrice) {
    this.id = id;
    this.roomName = roomName;
    this.roomImage = roomImage;
    this.roomPrice = roomPrice;
  }

  public RoomDTO() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public String getRoomImage() {
    return roomImage;
  }

  public void setRoomImage(String roomImage) {
    this.roomImage = roomImage;
  }

  public Long getRoomPrice() {
    return roomPrice;
  }

  public void setRoomPrice(Long roomPrice) {
    this.roomPrice = roomPrice;
  }
}
