package com.stockchart.service;

import java.util.List;

import com.stockchart.entity.User;
import com.stockchart.model.UserRequestModel;
import com.stockchart.model.UserResponseModel;

public interface UserService {
    public UserResponseModel createNewUser(UserRequestModel userRequestModel);
    public List<UserResponseModel> getAllUsers();
    public User findUserById(String userId);
    public UserResponseModel updateUser(UserRequestModel userRequestModel);
    public UserResponseModel deleteUser(UserRequestModel userRequestModel);
}
