package com.ecommerce.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
