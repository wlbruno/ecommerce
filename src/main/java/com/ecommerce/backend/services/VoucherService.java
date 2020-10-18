package com.ecommerce.backend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.backend.dto.VoucherDTO;
import com.ecommerce.backend.entities.Voucher;
import com.ecommerce.backend.repositories.VoucherRepository;

@Service
public class VoucherService {
	
	@Autowired
	private VoucherRepository repository;
	
	@Transactional(readOnly = true)
	public List<VoucherDTO> findAll() {
		List<Voucher> list = repository.findAll();
		return list.stream().map(x -> new VoucherDTO(x)).collect(Collectors.toList());
	}
}
