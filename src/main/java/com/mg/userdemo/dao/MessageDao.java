package com.mg.userdemo.dao;

import com.mg.userdemo.Entity.User;
import java.sql.Date;
import java.time.LocalDate;

public class MessageDao {

  private Integer messageId;
  private String content;
  private Date createdDate;
  private User user;

  public MessageDao() {
  }

  public MessageDao(String content,  User writer) {
    this.content = content;
    this.user = writer;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getContent() {

    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LocalDate getCreatedDate() {
    return createdDate.toLocalDate();
  }

  public void setCreatedDate(LocalDate createdDate)
  {
    this.createdDate = Date.valueOf(createdDate);
  }

  public Integer getMessageId() {
    return messageId;
  }

  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }

 }
