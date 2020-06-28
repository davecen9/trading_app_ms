package com.davecen9.bankapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davecen9.bankapi.pojos.Bank;
import com.davecen9.bankapi.repositories.BankRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepository;
	
	public List<Bank> findAllBanks(){
		return this.bankRepository.findAll();
	}
	
	
	
	public Bank saveBank(Bank bank) {
		return this.bankRepository.save(bank);
	}
	
	
	public Bank findBankById(Integer id) {
		return this.bankRepository.findById(id).orElse(null);
	}
}
