package com.cyan.hotel.repository;

import com.cyan.hotel.model.Booking;
import com.cyan.hotel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findBookingByUser(User user);

    List<Booking> findByDeleteFlag(int deleteFlag);

    Optional<Booking> findById (Long id);

}

