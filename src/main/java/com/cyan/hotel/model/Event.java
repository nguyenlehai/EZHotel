package com.cyan.hotel.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Event {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String eventDescription;

  private int eventDiscount;

  @ManyToMany(mappedBy = "events")
  Set<User> users;

  public Event() {

  }

  public long getId() {
	return id;
  }

  public void setId(long id) {
	this.id = id;
  }

  public String getEventDescription() {
	return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
	this.eventDescription = eventDescription;
  }

  public int getEventDiscount() {
	return eventDiscount;
  }

  public void setEventDiscount(int eventDiscount) {
	this.eventDiscount = eventDiscount;
  }
}
