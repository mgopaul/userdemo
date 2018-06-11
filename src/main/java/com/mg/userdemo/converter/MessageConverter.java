package com.mg.userdemo.converter;

import com.mg.userdemo.Entity.Message;
import com.mg.userdemo.dao.MessageDao;

public class MessageConverter {

  public static Message daoToEntity(MessageDao messageDao) {
    Message message = new Message(messageDao.getContent(), messageDao.getUser());
    message.setMessageId(messageDao.getMessageId());
    return message;
  }

  public static MessageDao entityToDao(Message message) {
    MessageDao messageDao = new MessageDao(message.getContent(), message.getUser());
    return messageDao;
  }
}
