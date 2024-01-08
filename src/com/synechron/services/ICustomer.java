package com.synechron.services;

import java.util.List;

import com.synechron.beans.Account;
import com.synechron.beans.Customer;
import com.synechron.exceptions.CustomerException;

public interface ICustomer {
	
	public List<Customer> addCustomer(Customer c, List<Customer> list);
	public List<Account> createAccount(int customerId,List<Customer> list,String accType, List<Account> acList ) throws CustomerException;
	public List<Customer> displayCustomers(List<Customer> list);
	public double checkBalance(int accountNo,List<Account> list );
	public List<Customer> deposit(int accountNo,double amount, List<Account> list);
	public List<Customer> withdraw(int accountNo,double amount,List<Account> list);
	public List<Customer> getEliteCustomers(List<Account> list,double amount);
}
