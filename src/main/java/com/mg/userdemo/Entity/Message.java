package com.mg.userdemo.Entity;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {

  @Column
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Integer messageId;
  @Lob
  private String content;

  @Column ( nullable = false)
  private LocalDate createdDate;


  @ManyToOne
  @JoinColumn (name= "userId")
  private User user;

  public Message() {
  }


  public Message(String content,  User writer) {
    this.content = content;
    this.createdDate = LocalDate.now();
    this.user = writer;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Integer getMessageId() {
    return messageId;
  }

  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }
}
