package com.ecommerce.backend.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.backend.dto.CartDTO;
import com.ecommerce.backend.dto.CartInsertDTO;
import com.ecommerce.backend.entities.Cart;
import com.ecommerce.backend.entities.Product;
import com.ecommerce.backend.entities.Voucher;
import com.ecommerce.backend.repositories.CartRepository;
import com.ecommerce.backend.repositories.ProductRepository;
import com.ecommerce.backend.repositories.VoucherRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private VoucherRepository voucherRepository;
	
	@Transactional
	public CartDTO insert (CartInsertDTO dto) {
		Cart entity = new Cart();
		entity.setMoment(Instant.now());
		
		Product product = productRepository.getOne(dto.getProductId());
		entity.setProducts(product);
		
		Voucher voucher = voucherRepository.getOne(dto.getVoucherId());
		entity.setVoucher(voucher);
		
		entity = repository.save(entity);
		return new CartDTO(entity);	
		
	}
}
