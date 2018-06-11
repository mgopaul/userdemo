package com.mg.userdemo.dao;

import java.util.Date;
import java.util.List;

public class UserDao {

  private Integer userId;
  private String username;
 // private String password;
  private String email;


  private List<MessageDao> messageDaos;

  public UserDao(String username, String email) {
    this.username = username;
    this.email = email;
  }

  public UserDao() {
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List <MessageDao> getMessageDaos() {
    return messageDaos;
  }

  public void setMessageDaos(List <MessageDao> messageDaos) {
    this.messageDaos = messageDaos;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
