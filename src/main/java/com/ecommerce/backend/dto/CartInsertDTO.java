package com.ecommerce.backend.dto;

import java.io.Serializable;

public class CartInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	private Long productId;
	private Long voucherId;
	
	public CartInsertDTO() {
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(Long voucherId) {
		this.voucherId = voucherId;
	}
	
}
