package com.demo.example.service;

import com.demo.example.repositories.entities.User;
import com.demo.example.vo.UserVO;

public interface UserService {

	User persistUser(UserVO userVO);
}
