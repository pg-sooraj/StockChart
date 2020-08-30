package com.stockchart.service;


import com.stockchart.model.UserRequestModel;
import com.stockchart.model.UserResponseModel;

public interface UserService {
    public UserResponseModel createNewUser(UserRequestModel userRequestModel);
    public UserResponseModel findUserById(Integer userId);
    public UserResponseModel updateUser(UserRequestModel userRequestModel);
    public void deleteUserById(Integer userId);
}
