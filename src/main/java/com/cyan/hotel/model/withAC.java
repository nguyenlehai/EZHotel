package com.cyan.hotel.model;

public class withAC extends RoomDecorator {

  public withAC(Room room) {
	super(room);
  }

  @Override
  public Double getPrice() {
	return super.getPrice() + 100;
  }

  @Override
  public String getDescription() {
	return super.getDescription() + " with AC!";
  }
}
