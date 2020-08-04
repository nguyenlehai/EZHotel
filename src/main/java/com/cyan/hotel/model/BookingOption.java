package com.cyan.hotel.model;

import javax.persistence.*;

@Entity
@Table(name = "booking_option")
public class BookingOption {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "booking", nullable = false, insertable = false, updatable = false)
  private Booking booking;

  @ManyToOne
  @JoinColumn(name = "room", nullable = false, insertable = false, updatable = false)
  private Room room;

  @ManyToOne
  @JoinColumn(name = "option", nullable = false, insertable = false, updatable = false)
  private Option option;

  @Column(name = "quantum_option")
  private Integer quantumOption;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Booking getBooking() {
    return booking;
  }

  public void setBooking(Booking booking) {
    this.booking = booking;
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }

  public Option getOption() {
    return option;
  }

  public void setOption(Option option) {
    this.option = option;
  }

  public Integer getQuantumOption() {
    return quantumOption;
  }

  public void setQuantumOption(Integer quantumOption) {
    this.quantumOption = quantumOption;
  }
}
