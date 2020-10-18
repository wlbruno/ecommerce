package com.ecommerce.backend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.backend.dto.VoucherDTO;
import com.ecommerce.backend.services.VoucherService;

@RestController
@RequestMapping(value = "/vouchers")
public class VoucherResource {
	
	@Autowired
	private VoucherService service;

	@GetMapping
	public ResponseEntity<List<VoucherDTO>> findAll() {
		List<VoucherDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
}
