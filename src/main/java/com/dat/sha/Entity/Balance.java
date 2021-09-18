package com.dat.sha.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Balance")
public class Balance {
	 
	
	@Id
	@GeneratedValue
	@Column(name="BlcNo")
	private Integer BalanceNo;
	@OneToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	@Column(name="balance_amount")
	private String balamount;
	
	@Column(name="created_at")
	private String createdat;
	
	@Column(name="Updated_at")
	private String Updatedat;

}
