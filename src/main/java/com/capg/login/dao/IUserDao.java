package com.capg.login.dao;

import com.capg.login.entity.*;

public interface IUserDao {
	
	
	boolean addUser(String username, User password); 
	boolean removeUser(String username);
	boolean updateUserPassword(String username, String previous_password);
	String forgetPassword(String username);
	
}
