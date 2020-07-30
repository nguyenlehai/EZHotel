package com.cyan.hotel.controller;

import com.cyan.hotel.dto.AdminBookingDTO;
import com.cyan.hotel.model.Booking;
import com.cyan.hotel.model.Room;
import com.cyan.hotel.repository.BookingRepository;
import com.cyan.hotel.repository.BookingRoomRepository;
import com.cyan.hotel.repository.RoomRepository;
import com.cyan.hotel.repositoryService.BookingService;
import com.cyan.hotel.requestForm.BookingForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static com.cyan.hotel.Constants.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class AdminListBookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    BookingRoomRepository bookingRoomRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/admin/booking")
    public String getListRoom(ModelMap modelMap) {
        List<Booking> bookingList = bookingService.findByDeleteFlag();
        List<AdminBookingDTO> adminBookingDTOS = new ArrayList<>();
        for (Booking booking : bookingList) {
            AdminBookingDTO adminBookingDTO = new AdminBookingDTO();
            adminBookingDTO.setId(booking.getId());
            adminBookingDTO.setBookingCode(booking.getBookingCode());
            adminBookingDTO.setRooms(roomRepository.findAllRooms(booking.getId()));
            adminBookingDTOS.add(adminBookingDTO);
        }
        modelMap.addAttribute("bookingList", adminBookingDTOS);
        return "adminListBooking";
    }

    @GetMapping(value = "/admin/booking/delete")
    public String deleteBooking (@RequestParam("id") Long id){
        Booking booking = bookingService.findById(id);
        booking.setDeleteFlag(DELETED);
        bookingRepository.save(booking);
        return "redirect:/admin/booking";
    }

    @GetMapping(value = "/admin/booking/add")
    public String addBooking(ModelMap modelMap){
        BookingForm bookingForm = new BookingForm();

        bookingForm.setRooms(roomRepository.listAllName());
        modelMap.addAttribute("bookingForm", bookingForm);
        return "createBooking";
    }

    @PostMapping(value = "/admin/booking/add")
    public String addBooking(@ModelAttribute("bookingForm") BookingForm bookingForm, ModelMap modelMap){
        Booking booking = new Booking();
        return "redirect:/admin/booking";
    }
}
