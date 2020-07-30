package com.cyan.hotel.repository;

import com.cyan.hotel.model.BookingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRoomRepository extends JpaRepository<BookingRoom, Long> {

    @Query(value = "SELECT * from BookingRoom br where br.booking_id = :id ", nativeQuery = true)
    List<BookingRoom> listByBooking(Long id);
}
