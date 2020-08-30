package com.stockchart.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.stockchart.dao.UserDao;
import com.stockchart.entity.User;
import com.stockchart.model.UserRequestModel;
import com.stockchart.model.UserResponseModel;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
    
	@Autowired
    private ModelMapper modelMapper;
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public UserResponseModel createNewUser(UserRequestModel userRequestModel) {
		User user = modelMapper.map(userRequestModel, User.class);
		return modelMapper.map(userDao.save(user), UserResponseModel.class);
	}

	@Override
	@Transactional
	public UserResponseModel findUserById(Integer userId) {
		User user = userDao.findById(userId).get();
		return modelMapper.map(user, UserResponseModel.class);
	}

	@Override
	@Transactional
	public UserResponseModel updateUser(UserRequestModel userRequestModel) {
		userDao.deleteById(userRequestModel.getUserId());
		User user = userDao.save(modelMapper.map(userRequestModel, User.class));
		return modelMapper.map(user, UserResponseModel.class);
	}

	@Override
	@Transactional
	public void deleteUserById(Integer userId) {
		userDao.deleteById(userId);
	}

}
