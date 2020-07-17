package com.cyan.hotel.model;

public class withWiFi extends RoomDecorator {

  public withWiFi(Room room) {
	super(room);
  }

  @Override
  public Double getPrice() {
	return super.getPrice() + 20;
  }

  @Override
  public String getDescription() {
	return super.getDescription() + ": with WiFi!";
  }
}
