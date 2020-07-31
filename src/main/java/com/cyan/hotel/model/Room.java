package com.cyan.hotel.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "room")
public abstract class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomName;

    private String roomImage;

    private Long roomPrice;

    @ManyToOne
    @JoinColumn(name = "room_type_id", nullable = false, insertable = false, updatable = false)
    private RoomType room_type;

    @OneToMany(mappedBy = "room")
    Set<BookingRoom> bookingRooms;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String room_name) {
        this.roomName = room_name;
    }

    public Long getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Long room_price) {
        this.roomPrice = room_price;
    }

    public String getRoomImage() {
        return roomImage;
    }

    public void setRoomImage(String room_image) {
        this.roomImage = room_image;
    }
}
