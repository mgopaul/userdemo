package com.mg.userdemo.Entity;

public class Comment extends Message {

  private Message parent;

  public Message getParent() {
    return parent;
  }

  public void setParent(Message parent) {
    this.parent = parent;
  }
}
