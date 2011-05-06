package com.idega.block.process.message.data;

import com.idega.data.IDOException;
import com.idega.user.data.User;


public interface MessageHome extends com.idega.data.IDOHome
{
 public Message create() throws javax.ejb.CreateException;
 public Message findByPrimaryKey(Object pk) throws javax.ejb.FinderException;
 public java.util.Collection findMessages(com.idega.user.data.User p0)throws javax.ejb.FinderException;
 public java.util.Collection findMessages(com.idega.user.data.User p0, String[] status)throws javax.ejb.FinderException;
 public java.util.Collection findMessages(com.idega.user.data.Group p0, String[] status)throws javax.ejb.FinderException;
 public java.util.Collection findMessages(com.idega.user.data.User p0, String[] status, int numberOfEntries, int startingEntry)throws javax.ejb.FinderException;
 public java.util.Collection findMessages(com.idega.user.data.Group p0, String[] status, int numberOfEntries, int startingEntry)throws javax.ejb.FinderException;
 public java.util.Collection findMessages(com.idega.user.data.User p0, java.util.Collection groups, String[] status, int numberOfEntries, int startingEntry)throws javax.ejb.FinderException;
 public int getNumberOfMessages(com.idega.user.data.User p0, String[] status) throws IDOException;
 public int getNumberOfMessages(com.idega.user.data.User p0, java.util.Collection groups, String[] status) throws IDOException;
 public java.util.Collection <Message>findMessages(User user, String caseId)throws javax.ejb.FinderException;
}