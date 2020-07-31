package com.cyan.hotel.dto;

public class RoomDTO {
  private long id;
  private String name;
  private String roomImage;
  private Long roomPrice;

  public RoomDTO(long id, String name, String roomImage, Long roomPrice) {
    this.id = id;
    this.name = name;
    this.roomImage = roomImage;
    this.roomPrice = roomPrice;
  }

  public RoomDTO() {

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
