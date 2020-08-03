package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Booking;
import com.cyan.hotel.model.User;

import java.util.List;

public interface BookingService {
  void insertBooking(String bookingDate, Integer numberOfGuests, Double bookingTotal, String username);

  Booking findBookingByUser(User user);


  List<Booking> findAll();
}
