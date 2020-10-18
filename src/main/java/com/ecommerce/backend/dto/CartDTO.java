package com.ecommerce.backend.dto;

import java.io.Serializable;
import java.time.Instant;

import com.ecommerce.backend.entities.Cart;

public class CartDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant moment;
	private String productName;
	private String productPrice;
	private String productCategory;
	private String voucherName;
	private String voucherValue;
	
	public CartDTO() {
	}
	
	public CartDTO(Cart entity) {
		id = entity.getId();
		moment = entity.getMoment();
		productName = entity.getProducts().getName();
		productPrice = entity.getProducts().getPrice();
		productCategory = entity.getProducts().getCategory().getName();
		voucherName = entity.getVoucher().getName();
		voucherValue = entity.getVoucher().getDiscount_amount();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getVoucherName() {
		return voucherName;
	}

	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherValue() {
		return voucherValue;
	}

	public void setVoucherValue(String voucherValue) {
		this.voucherValue = voucherValue;
	}
	
	
}
