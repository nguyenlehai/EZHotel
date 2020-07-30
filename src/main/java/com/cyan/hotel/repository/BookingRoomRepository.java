package com.cyan.hotel.repository;

import com.cyan.hotel.model.BookingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRoomRepository extends JpaRepository<BookingRoom, Long> {

    @Query(value = "delete from booking_room where booking_id = :id", nativeQuery = true)
    void deleteByBookingId(@Param("id") Long id);
}
