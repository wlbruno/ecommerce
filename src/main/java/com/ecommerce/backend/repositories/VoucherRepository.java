package com.ecommerce.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.backend.entities.Voucher;

@Repository
public interface VoucherRepository extends JpaRepository<Voucher, Long> {
	
}
