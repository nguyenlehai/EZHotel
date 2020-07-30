package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Booking;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.cyan.hotel.Constants.*;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    private UserService userService;

    @Override
    public void insertBooking(String bookingDate, Integer numberOfGuests,
                              Double bookingTotal, String username) {
        Booking booking = new Booking();
        booking.setBookingDate(bookingDate);
        booking.setUser(userService.findByUsername(username));
        bookingRepository.save(booking);
    }

    @Override
    public Booking findBookingByUser(User user) {
        Long userId = user.getId();
        return bookingRepository
                .findBookingByUser(userService.findByUserId(userId));
    }

    @Override
    public Booking findById(Long id) {
        return bookingRepository.findById(id).get();
    }


    @Override
    public List<Booking> findByDeleteFlag() {
        return bookingRepository.findByDeleteFlag(NOT_DELETED);
    }


}
