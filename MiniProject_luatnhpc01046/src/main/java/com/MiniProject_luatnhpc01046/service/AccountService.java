package com.MiniProject_luatnhpc01046.service;

import java.util.List;

import com.MiniProject_luatnhpc01046.entity.Account;

public interface AccountService {
	public Account findById(String username);
	public List<Account> getAdministrators();
	public List<Account> findAll();
}	
