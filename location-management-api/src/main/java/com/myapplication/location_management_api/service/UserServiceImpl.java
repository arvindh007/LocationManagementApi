package com.myapplication.location_management_api.service;

import com.myapplication.location_management_api.entity.UserEntity;
import com.myapplication.location_management_api.model.UserModel;
import com.myapplication.location_management_api.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserEntityRepository entityRepository;
    @Override
    public void login(UserModel userModel){
        UserEntity userEntity=entityRepository.findByEmailAndPassword(userModel.getEmail(), userModel.getPassword());
    }
}
