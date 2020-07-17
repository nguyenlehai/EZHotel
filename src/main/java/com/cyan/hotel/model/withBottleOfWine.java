package com.cyan.hotel.model;

public class withBottleOfWine extends RoomDecorator {

  public withBottleOfWine(Room room) {
	super(room);
  }

  @Override
  public Double getPrice() {
	return super.getPrice() + 50;
  }

  @Override
  public String getDescription() {
	return super.getDescription() + " with bottle of wine!";
  }
}

