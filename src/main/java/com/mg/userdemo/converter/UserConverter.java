package com.mg.userdemo.converter;

import com.mg.userdemo.Entity.User;
import com.mg.userdemo.dao.UserDao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class UserConverter {

  public static User daoToEntity(UserDao userDao) {
    User user = new User(userDao.getUsername(), userDao.getEmail());
    //user.setMessages(userDao.getMessageDaos().stream().map(MessageConverter::daoToEntity)
    //    .collect(Collectors.toList()));
    return user;
  }

  public static UserDao entityToDao(User user) {
    UserDao userDao = new UserDao(user.getUsername() ,user.getEmail());
    userDao.setMessageDaos(user.getMessages().stream().map(MessageConverter::entityToDao)
       .collect(Collectors.toList()));
    return userDao;
  }

}
