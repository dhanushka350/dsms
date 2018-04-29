package com.driving_school.dsms.serviceImpl;

import com.driving_school.dsms.data_transfer_object.User;
import com.driving_school.dsms.model.UserModel;
import com.driving_school.dsms.repository.UserRepository;
import com.driving_school.dsms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public String saveUser(User user) {
        UserModel model = new UserModel();
        model.setName(user.getName());
        model.setPass(user.getPass());
        return repository.save(model).getName();
    }

    @Override
    public UserModel checkLogin(User user) {
        return repository.findByName(user.getName());
    }


}
