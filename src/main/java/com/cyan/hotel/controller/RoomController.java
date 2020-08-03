package com.cyan.hotel.controller;

import com.cyan.hotel.dto.RoomDTO;
import com.cyan.hotel.model.Room;
import com.cyan.hotel.repository.BookingRoomRepository;
import com.cyan.hotel.repositoryService.RoomService;
import com.cyan.hotel.requestForm.ReservationForm;
import com.cyan.hotel.validator.InputValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RoomController {
  @Autowired
  private RoomService roomService;

  @Autowired
  private InputValidator inputValidator;

  @Autowired
  BookingRoomRepository bookingRoomRepository;

  @GetMapping(value = "/room")
  public String show(ModelMap modelMap) {
    modelMap.addAttribute("reservationForm", new ReservationForm());
    return "room";
  }

  @PostMapping(value = "/room")
  public String goToChooseRoomPage(@Valid @ModelAttribute("reservationForm") ReservationForm reservationForm,
                                   BindingResult result, Model model) throws ParseException {
    inputValidator.validateReservationRoom(reservationForm, result);

    if (result.hasErrors()) {
      return "room";
    }
    return "redirect:/room/chooseRoom";
  }

  @GetMapping(value = "/room/chooseRoom")
  public String chooseRoom(ModelMap modelMap) {
    List<Room> roomList = roomService.findAll();
    List<RoomDTO> roomDTOs = new ArrayList<>();
    for (Room room : roomList) {
      RoomDTO roomDTO = new RoomDTO();
      roomDTO.setId(room.getId());
      roomDTO.setRoomName(room.getRoomName());
      roomDTO.setRoomImage(room.getRoomImage());
      roomDTO.setRoomPrice(room.getRoomPrice());
      roomDTOs.add(roomDTO);
    }
    modelMap.addAttribute("roomList", roomDTOs);
    return "chooseRoom";
  }
}
