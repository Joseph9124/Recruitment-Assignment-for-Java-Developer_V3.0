package com.in28minutes.springboot.rest.example.student;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class InvoiceService {
	
	@Autowired
	private Repo repo;
	
	public ResponseEntity<Object> addInvoice(Invoice invoice) {
		Invoice save = repo.save(invoice);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(save.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	public List<Invoice> viewAllInvoices() {
		
		List<Invoice> invoices = new ArrayList<>();
		repo.findAll().forEach(invoices::add);
		return invoices;
	}
	
	public Optional<Invoice> viewInvoice(Long invoiceId) {
		return repo.findById(invoiceId);
	}

}
