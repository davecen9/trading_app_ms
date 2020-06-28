package com.davecen9.bankapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davecen9.bankapi.pojos.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer>{

}
