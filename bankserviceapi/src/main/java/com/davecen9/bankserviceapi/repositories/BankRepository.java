package com.davecen9.bankserviceapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davecen9.bankserviceapi.models.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer>{

}
