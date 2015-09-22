package com.topyfi.dao;

import com.topyfi.model.NormalUser;

public interface NormalUserDAO {
	public void addUser(NormalUser user);
	public NormalUser getUserByLogin(String login);
}
