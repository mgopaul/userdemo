package com.mg.userdemo.service;

import com.mg.userdemo.converter.MessageConverter;
import com.mg.userdemo.converter.UserConverter;
import com.mg.userdemo.dao.UserDao;
import com.mg.userdemo.repository.MessageRepository;
import com.mg.userdemo.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
  @Autowired
  UserRepository userRepository;

  @Autowired
  MessageRepository msgRepository;

  @Override
  public UserDao getUserById(Integer userId){
    return UserConverter.entityToDao(userRepository.getOne(userId));
  }

  @Override
  public void saveUser( UserDao userDao){
    userRepository.save( UserConverter.daoToEntity(userDao));
    msgRepository.save(MessageConverter.daoToEntity(userDao.getMessageDaos().get(0)));
  }

  @Override
  public List<UserDao> getAllUsers(){
    return userRepository.findAll().stream().map( UserConverter::entityToDao).collect(
        Collectors.toList());
  }

}
