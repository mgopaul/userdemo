package com.mg.userdemo.controller;

import com.mg.userdemo.dao.UserDao;
import com.mg.userdemo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping("/getUser/{userId}")
  public UserDao getUserById(@PathVariable Integer userId)
  {
    return userService.getUserById(userId);
  }
  @RequestMapping("/getAllUsers")
  public List<UserDao > getAllUsers()
  {
    return userService.getAllUsers();
  }

  @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
  public void saveUser(@RequestBody UserDao userDao)
  {
    userService.saveUser(userDao);
  }

}
