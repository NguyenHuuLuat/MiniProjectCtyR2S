package com.MiniProject_luatnhpc01046.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProject_luatnhpc01046.dao.CategoryDAO;
import com.MiniProject_luatnhpc01046.entity.Category;
import com.MiniProject_luatnhpc01046.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}
}
