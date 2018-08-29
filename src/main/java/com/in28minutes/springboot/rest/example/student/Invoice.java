package com.in28minutes.springboot.rest.example.student;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Invoice{
	@Id
	@GeneratedValue
	private Long id;
	private Long vatRate;
	private Date invoiceDate;
	
	@ManyToOne
	private LineItem lineitem;
	
	public Invoice() {
		super();
	}

	public Invoice(Long id, Long vatRate, Date invoiceDate,Long itemId) {
		super();
		this.id = id;
		this.vatRate = vatRate;
		this.invoiceDate = invoiceDate;
		this.lineitem = new LineItem(itemId,null,"",new BigDecimal("0000.00"));
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVatRate() {
		return vatRate;
	}
	public void setVatRate(Long vatRate) {
		this.vatRate = vatRate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public LineItem getLineitem() {
		return lineitem;
	}

	public void setLineitem(LineItem lineitem) {
		this.lineitem = lineitem;
	}
	
	
		
}
