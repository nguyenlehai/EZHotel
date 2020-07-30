package com.cyan.hotel.dto;

public class AdminRoomDTO {
  private String infoRoom;
  private String description;
  private String services;
  private Double price;

  public AdminRoomDTO(String infoRoom, String description, String services, Double price) {
    this.infoRoom = infoRoom;
    this.description = description;
    this.services = services;
    this.price = price;
  }

  public String getInfoRoom() {
    return infoRoom;
  }

  public void setInfoRoom(String infoRoom) {
    this.infoRoom = infoRoom;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getServices() {
    return services;
  }

  public void setServices(String services) {
    this.services = services;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
