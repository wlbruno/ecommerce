package com.ecommerce.backend.dto;

import java.io.Serializable;

import com.ecommerce.backend.entities.Voucher;

public class VoucherDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String description;
	private String discount_amount;
	
	public VoucherDTO() {
	}
	
	public VoucherDTO(Voucher entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		discount_amount = entity.getDiscount_amount();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscount_amount() {
		return discount_amount;
	}

	public void setDiscount_amount(String discount_amount) {
		this.discount_amount = discount_amount;
	}
	
	
}
