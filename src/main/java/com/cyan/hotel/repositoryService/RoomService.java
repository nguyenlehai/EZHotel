package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Room;

import java.util.List;

public interface RoomService {
    Room findRoomByRoomId(Long roomId);

    List<Room> findAll();

    List<Room> getRoomsByRoomType(String roomType);

}
