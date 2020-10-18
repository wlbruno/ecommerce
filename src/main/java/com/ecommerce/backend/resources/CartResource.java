package com.ecommerce.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.backend.dto.CartDTO;
import com.ecommerce.backend.dto.CartInsertDTO;
import com.ecommerce.backend.services.CartService;

@RestController
@RequestMapping(value = "/carts")
public class CartResource {
	
	@Autowired
	private CartService service;
	 
	@PostMapping
	public ResponseEntity<CartDTO> insert(@RequestBody CartInsertDTO dto) {
		CartDTO  newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);		
	}
	
}
