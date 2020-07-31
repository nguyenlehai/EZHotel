package com.cyan.hotel.controller;

import com.cyan.hotel.dto.RoomDTO;
import com.cyan.hotel.enumeration.RoomStyle;
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
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.EnumSet;
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
      roomDTO.setName(room.getRoomName());
      roomDTO.setRoomImage(room.getRoomImage());
      roomDTO.setRoomPrice(room.getRoomPrice());
//      roomRepository.findAllRooms(room.getId());
//      roomDTO.setRooms(roomRepository.findAllRooms(booking.getId()));

      roomDTOs.add(roomDTO);
    }
    modelMap.addAttribute("roomInfoList", roomDTOs);
    return "chooseRoom";
  }

  @GetMapping(value = "/room/show/{roomType}")
  public String getRoomType(@PathVariable String roomType, Model model) {

    List<Room> roomList = roomService.getRoomsByRoomType(roomType);
    model.addAttribute("roomList", roomList);
    model.addAttribute("roomType", roomType);

    List<RoomStyle> roomTypes = getRoomTypes();
    model.addAttribute("roomTypesList", roomTypes);
    return "/room";
  }

  @GetMapping(value = "/room/show")
  public String getRoomTypeByForm(@RequestParam("roomTypesList") String roomType) {
    if (!roomType.isEmpty()) {
      return "redirect:/room/show/" + roomType;
    }
    return "/room";
  }

  private List<RoomStyle> getRoomTypes() {
    return new ArrayList<RoomStyle>(EnumSet.allOf(RoomStyle.class));
  }
}
