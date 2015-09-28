package com.topyfi.dao;

import com.topyfi.model.NormalUser;

public interface NormalUserDao {
	public void addUser(NormalUser user);
	public void deleteUser(NormalUser user);
	public NormalUser getUserByLogin(String login);
}
