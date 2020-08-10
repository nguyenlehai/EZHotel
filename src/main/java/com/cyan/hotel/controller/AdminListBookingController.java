package com.cyan.hotel.controller;

import com.cyan.hotel.dto.AdminBookingDTO;
import com.cyan.hotel.model.Booking;
import com.cyan.hotel.repository.BookingRoomRepository;
import com.cyan.hotel.repository.RoomRepository;
import com.cyan.hotel.repositoryService.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminListBookingController {

  @Autowired
  BookingService bookingService;

  @Autowired
  BookingRoomRepository bookingRoomRepository;

  @Autowired
  RoomRepository roomRepository;

  @GetMapping(value = "/admin/booking")
  public String getListRoom(ModelMap modelMap) {
    List<Booking> bookingList = bookingService.findAll();
    List<AdminBookingDTO> adminBookingDTOS = new ArrayList<>();
    for (Booking booking : bookingList) {
      AdminBookingDTO adminBookingDTO = new AdminBookingDTO();
      adminBookingDTO.setId(booking.getId());
      adminBookingDTO.setBookingCode(booking.getBookingCode());
//      adminBookingDTO.setRooms(roomRepository.findAllRooms(booking.getId()));
      adminBookingDTOS.add(adminBookingDTO);
    }
    modelMap.addAttribute("bookingList", adminBookingDTOS);
    return "adminListBooking";
  }
}
