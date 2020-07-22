package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roomType")
public class RoomType {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long roomTypeId;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private RoomStyle type;

  @OneToMany(mappedBy = "room_type")
  Set<Room> rooms;

  public Long getRoomTypeId() {
	return roomTypeId;
  }

  public void setRoomTypeId(Long roomTypeId) {
	this.roomTypeId = roomTypeId;
  }

  public RoomStyle getType() {
	return type;
  }

  public void setType(RoomStyle type) {
	this.type = type;
  }
}
