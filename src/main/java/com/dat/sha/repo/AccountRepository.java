package com.dat.sha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dat.sha.Entity.Account;

public interface AccountRepository extends  JpaRepository<Account, Integer> {

}
