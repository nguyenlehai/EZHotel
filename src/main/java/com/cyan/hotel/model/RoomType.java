package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RoomType {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  private RoomStyle type;

  @OneToMany(mappedBy = "room_type")
  Set<Room> rooms;

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public RoomStyle getType() {
	return type;
  }

  public void setType(RoomStyle type) {
	this.type = type;
  }
}
