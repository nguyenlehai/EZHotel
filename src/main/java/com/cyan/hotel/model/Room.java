package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

@Entity(name = "room")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")
    private Long roomId;

    @Column(name = "roomStatus")
    @Pattern(regexp = "^[01]")
    private Integer roomStatus;

    @ManyToOne
    @JoinColumn(name = "bookingId")
    private Booking booking;

    public Room() {
        this.roomStatus = 0;
    }

    abstract Double getPrice();
    abstract String getDescription();

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

//    public Booking getBooking() {
//        return booking;
//    }
//
//    public void setBooking(Booking booking) {
//        this.booking = booking;
//    }
}