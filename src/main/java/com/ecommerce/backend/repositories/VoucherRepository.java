package com.ecommerce.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.entities.Voucher;

public interface VoucherRepository extends JpaRepository<Voucher, Long> {
	
}
