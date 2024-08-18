package com.web.DiamondHotel.service.interfac;

import com.web.DiamondHotel.dto.LoginRequest;
import com.web.DiamondHotel.dto.Response;
import com.web.DiamondHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
