package com.mg.userdemo.service;

import com.mg.userdemo.dao.UserDao;
import java.util.List;

public interface UserService {
  UserDao getUserById(Integer userId);

  void saveUser(UserDao userDao);

  List < UserDao > getAllUsers();
}
