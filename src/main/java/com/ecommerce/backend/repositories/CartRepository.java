package com.ecommerce.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.backend.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
}
