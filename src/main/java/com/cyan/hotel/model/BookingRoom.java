package com.cyan.hotel.model;

import javax.persistence.*;

@Entity
@Table(name = "booking_room")
public class BookingRoom {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "booking_id", nullable = false)
  private Booking booking;

  @ManyToOne
  @JoinColumn(name = "room_id", nullable = false)
  private Room room;
}
