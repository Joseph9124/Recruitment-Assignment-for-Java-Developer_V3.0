package com.in28minutes.springboot.rest.example.student;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LineItem {
	
	@Id
	@GeneratedValue
	private Long id;
	private Long quantity;
	private String description;
	private BigDecimal unitPrice;
	
	public LineItem() {
		super();
	}
	
	public LineItem(Long id, Long quantity, String description, BigDecimal unitPrice) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.description = description;
		this.unitPrice = unitPrice;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
//	public BigDecimal getLineItemTotal() {
//		return unitPrice;
//		
//	}

}
