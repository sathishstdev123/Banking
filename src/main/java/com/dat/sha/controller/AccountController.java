package com.dat.sha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dat.sha.Entity.Account;
import com.dat.sha.Service.IAccountService;

@Controller
@RequestMapping("/banking")
public class AccountController  {
 
	@Autowired
	private IAccountService service;
	 
	@GetMapping("/home")
	 public String homePage() {
		 return "HomePage";
	 }
	@GetMapping("/login")
	 public String showLoginPage() {	
		  return "LoginPage";
	 }
	 
	 @GetMapping("/create")
	  public String  createPage() {
		 return  "CreateAccount";
	 }
	  
	   @PostMapping("/save")
	  public String saveAccount(@ModelAttribute Account account,Model model) {
		Integer id = service.saveAccount(account);	
		String username = account.getUsername();
		String password  =  account.getPassward();
		   String message ="Account has been'"+ id+"' created successfully";
		   model.addAttribute("Account",message);
		    model.addAttribute("Accountid", id);
		    model.addAttribute("Accountun", username);
		    model.addAttribute("Accountpd", password);
		    return "SuccessPage";
		  
	  }
	   @PostMapping("/BankingPage")
	   public  String bankingPage() {
		   
		   return "BankMainPage";
	  }
}
