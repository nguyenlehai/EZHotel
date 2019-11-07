package com.cyan.hotel.repository;

import com.cyan.hotel.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/
public interface UserRepository extends JpaRepository<Guest, Long> {

    @Query(value = "select g from guest g where g.username = :username")
    Guest findGuestByUsername(@Param("username") String username);

    @Query(value = "select g from guest g")
    Collection<Guest> findAllGuests();
}