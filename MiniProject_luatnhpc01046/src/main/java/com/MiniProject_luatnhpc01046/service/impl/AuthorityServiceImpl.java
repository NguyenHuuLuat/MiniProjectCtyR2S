package com.MiniProject_luatnhpc01046.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProject_luatnhpc01046.dao.AccountDAO;
import com.MiniProject_luatnhpc01046.dao.AuthorityDAO;
import com.MiniProject_luatnhpc01046.entity.Account;
import com.MiniProject_luatnhpc01046.entity.Authority;
import com.MiniProject_luatnhpc01046.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acdao;

	
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	public Authority create(Authority auth) {
		// TODO Auto-generated method stub
		return dao.save(auth);
	}

	
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

}
