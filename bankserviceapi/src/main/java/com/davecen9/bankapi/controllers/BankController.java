package com.davecen9.bankapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.davecen9.bankapi.pojos.Bank;
import com.davecen9.bankapi.services.BankService;

@RestController
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@GetMapping("/banks")
	public List<Bank> getAllBanks() {
		return this.bankService.findAllBanks();
		
	}
	
	@PostMapping("/banks")
	public ResponseEntity<Bank> saveBank(@RequestBody Bank bank){
		Bank savedBank = this.bankService.saveBank(bank);
		return ResponseEntity.ok(savedBank);
	}
	
	
	@GetMapping("/banks/{id}")
	public ResponseEntity<Bank> findBankById(@PathVariable Integer id){
		Bank bank = this.bankService.findBankById(id);
		if(bank!=null)
		return ResponseEntity.ok(bank);
		else
			return null;
	}

}
