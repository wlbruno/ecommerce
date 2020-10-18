package com.ecommerce.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	
}
