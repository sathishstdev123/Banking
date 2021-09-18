package com.dat.sha.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Account")
public class Account {
	 
	@Id
	@GeneratedValue
	@Column(name="account_id")
	private Integer Acno;
	
	@Column(name="uname")
	private String Username;
	
	@Column(name="pswrd")
	private String Passward;
	
	@Column(name="fname")
	private String Firstname;
	
	@Column(name="lname")
	private String Lastname;
	
	@Column(name="createdat")
	private String Createdat;
	
	@Column(name="updateat")
	private String Updateat;
	
}
