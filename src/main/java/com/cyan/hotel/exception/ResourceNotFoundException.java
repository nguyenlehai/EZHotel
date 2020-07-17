package com.cyan.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(String resourceType, String name, String value) {
	super("Error: " + resourceType + " with " + name + "[" + value + "] not found!!");
  }
}
