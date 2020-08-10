package com.cyan.hotel.repository;

import com.cyan.hotel.model.BookingRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingOptionRepository extends JpaRepository<BookingRoom, Long> {
//
//  @Query(value = "SELECT * from BookingService bs where bs.services = :id ", nativeQuery = true)
//  List<BookingOption> listByService(Long id);
}
