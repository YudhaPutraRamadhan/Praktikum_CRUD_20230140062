package com.deploy.praktikum1.service.Impl;

import com.deploy.praktikum1.mapper.UserMapper;
import com.deploy.praktikum1.model.dto.UserAddRequest;
import com.deploy.praktikum1.model.dto.UserDto;
import com.deploy.praktikum1.model.entity.User;
import com.deploy.praktikum1.repository.UserRepository;
import com.deploy.praktikum1.util.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;


}
