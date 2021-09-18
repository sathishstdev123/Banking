package com.dat.sha.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.sha.Entity.Account;
import com.dat.sha.Service.IAccountService;
import com.dat.sha.repo.AccountRepository;

@Service
public class AccoountServiceImpl implements IAccountService {
	 
	@Autowired
	private AccountRepository repo;

	@Override
	public Integer saveAccount(Account account) {
		Account id=repo.save(account);
		return account.getAcno();
	}

	
	
	

	
	

}
