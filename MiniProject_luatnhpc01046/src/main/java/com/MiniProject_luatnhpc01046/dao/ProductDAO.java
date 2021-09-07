package com.MiniProject_luatnhpc01046.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.MiniProject_luatnhpc01046.entity.Product;




public interface ProductDAO extends JpaRepository<Product, Integer> {
	@Query("SELECT a FROM Product a WHERE a.name LIKE ?1 ")
	Page<Product> timTheoTen(String tu, Pageable p);
	
	@Query("SELECT a FROM Product a WHERE a.category.id LIKE ?1")
	Page<Product> timTheoLoai(String tu, Pageable p);
	Page<Product> findByPriceBetween(double minPrice, double maxPrice, Pageable pageable);

	@Query("SELECT a FROM Product a WHERE a.category.id LIKE ?1")
	List<Product> test(String tu);

	@Query("SELECT p FROM Product p WHERE p.category.id=?1")
	List<Product> findByCategoryId(String cid);
	

}
