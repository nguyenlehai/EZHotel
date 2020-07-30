package com.cyan.hotel.model;

import javax.persistence.*;

@Entity
@Table(name = "booking_service")
public class BookingService {
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
    @JoinColumn(name = "service", nullable = false, insertable = false, updatable = false)
    private Service service;

    @Column(name = "number_service")
    private Integer number_service;

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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Integer getNumber_service() {
        return number_service;
    }

    public void setNumber_service(Integer number_service) {
        this.number_service = number_service;
    }
}
