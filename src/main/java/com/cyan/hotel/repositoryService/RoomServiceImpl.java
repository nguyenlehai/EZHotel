package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Room;
import com.cyan.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
  @Autowired
  private RoomRepository roomRepository;

  @Override
  public Room findRoomByRoomId(Long roomId) {
	return null;
  }

  @Override
  public List<Room> findAllRooms() {
	return null;
  }

  @Override
  public List<Room> findAllAvailableRooms() {
	return null;
  }

  @Override
  public List<Room> getRoomsByRoomType(String roomType) {
	return null;
  }

  @Override
  public void updateRoomStatus(Long roomId, Integer roomStatus) {
	//roomRepository.updateRoomStatus(roomId, roomStatus);
  }
}
