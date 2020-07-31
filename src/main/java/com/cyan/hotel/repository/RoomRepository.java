package com.cyan.hotel.repository;

import com.cyan.hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

  @Query(value = "select r.room_name  from room r join booking_room br on r.id = br.room_id where br.booking_id = :id", nativeQuery = true)
  List<String> findAllRooms(@Param("id") Long id);

  List<Room> findAll();

//
//  List<Room> getRoomsByRoomType(String roomType);
//
//  Room getRoomByRoomId(Long roomId);

//    @Modifying(clearAutomatically = true)
//    @Query("update Room room set room.roomStatus=?2 where room.roomId=?1")
//    void updateRoomStatus(Long roomId, Integer roomStatus);

}
