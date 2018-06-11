package com.mg.userdemo.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "user")
public class User implements Serializable {

  private static final long serialVersionUID = 1297981167737259360L;

  @Column
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  Integer userId;

  @Column(nullable = false, unique = true)
  String username;

  /*@Column(nullable = false)
  @Transient
  private String password;*/

  @Column(name = "email", nullable = false, unique = true)
  @Email(message = "Please provide a valid email")
  @NotEmpty(message = "Please provide a valid email")
  private String email;

 /* @Column
  private LocalDate createdDate;

  @Column
  private LocalDate lastLoggedOn;*/

  @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
  private List <Message> messages = new LinkedList <>();

  public User() {
  }

  public User(String username,  String email) {
    this.username = username;
    this.email = email;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId)
  {
    this.userId = userId;
  }

  public void setMessages(List <Message> messages) {
    this.messages = messages;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public List <Message> getMessages() {
    return messages;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


}
