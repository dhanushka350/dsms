package com.driving_school.dsms.service;

import com.driving_school.dsms.data_transfer_object.User;
import com.driving_school.dsms.model.UserModel;

public interface UserService {

    public String saveUser(User user);
    public UserModel checkLogin(User user);
}
