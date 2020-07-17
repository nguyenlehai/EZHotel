package com.cyan.hotel.exception;

public class RoomNotFoundException extends ResourceNotFoundException {
  public RoomNotFoundException(Long roomId) {
	super("Room", "roomId", roomId.toString());
  }
}
