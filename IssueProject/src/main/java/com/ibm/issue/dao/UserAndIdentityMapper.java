package com.ibm.issue.dao;

import java.util.List;

import com.ibm.issue.pojo.User;
import com.ibm.issue.pojo.UserPage;

public interface UserAndIdentityMapper {
	List<User> findUserAndIdentity(UserPage user);
}
