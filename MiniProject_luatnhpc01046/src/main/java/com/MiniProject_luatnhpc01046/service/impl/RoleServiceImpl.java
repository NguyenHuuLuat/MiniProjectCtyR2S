package com.MiniProject_luatnhpc01046.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProject_luatnhpc01046.dao.RoleDAO;
import com.MiniProject_luatnhpc01046.entity.Role;
import com.MiniProject_luatnhpc01046.service.RoleService;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleDAO dao;
	
	public List<Role> findAll() {
		return dao.findAll();
	}
}
