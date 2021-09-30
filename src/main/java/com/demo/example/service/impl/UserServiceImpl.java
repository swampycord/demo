package com.demo.example.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.repositories.UserRepository;
import com.demo.example.repositories.entities.User;
import com.demo.example.service.UserService;
import com.demo.example.vo.UserVO;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User persistUser(UserVO userVO) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(userVO.getName());
		user.setRole(userVO.getRole());

		return userRepository.save(user);

	}
}
