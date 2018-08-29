package com.in28minutes.springboot.rest.example.student;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	@RequestMapping(method=RequestMethod.POST,value="/invoices")
	public ResponseEntity<Object> addInvoice(@RequestBody Invoice invoice) {
		//invoice.setLineitem(new LineItem(id,null,"",0.00));
		return invoiceService.addInvoice(invoice);
	}
	
	@RequestMapping("/invoices")
	public List<Invoice> viewAllInvoices(){
		return invoiceService.viewAllInvoices();
	}
	
	@RequestMapping("/invoices/{invoiceId}")
	public Invoice viewInvoice(@PathVariable Long invoiceId) {
		Optional<Invoice> invoice = invoiceService.viewInvoice(invoiceId);
		
				if(invoice.isPresent()) {
					return invoice.get();
				}else {
					return null;
				}
	}
	
	
//
//	@GetMapping("/invoices")
//	public List<Invoice> retrieveAllStudents() {
//		return repo.findAll();
//	}
//
//	@GetMapping("/invoices/{id}")
//	public Invoice retrieveStudent(@PathVariable long id) {
//		Optional<Invoice> invoice = repo.findById(id);
//
//		if(invoice.isPresent()) {
//			return invoice.get();
//		}else {
//			return null;
//		}
//	}
//
//	@PostMapping("/invoices")
//	public ResponseEntity<Object> createStudent(@RequestBody Invoice invoice) {
//		Invoice save = repo.save(invoice);
//
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(save.getId()).toUri();
//
//		return ResponseEntity.created(location).build();
//
//	}
}
