package com.cyan.hotel.controller;

import com.cyan.hotel.enumeration.RoomStyle;
import com.cyan.hotel.model.Room;
import com.cyan.hotel.repositoryService.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@Controller
public class RoomController {
  @Autowired
  private RoomService roomService;

  @GetMapping(value = "/room")
  public ModelAndView show() {
	List<RoomStyle> roomTypes = getRoomTypes();

	ModelAndView model = new ModelAndView("room");
	model.addObject("roomTypesList", roomTypes);
	return model;
  }

  @GetMapping(value = "/room/chooseRoom")
  public ModelAndView chooseRoom() {
	List<RoomStyle> roomTypes = getRoomTypes();

	ModelAndView model = new ModelAndView("chooseRoom");
	model.addObject("roomTypesList", roomTypes);
	return model;
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
