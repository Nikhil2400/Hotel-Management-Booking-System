package com.web.DiamondHotel.service.interfac;

import com.web.DiamondHotel.dto.Response;
import com.web.DiamondHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
