package com.synechron.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.synechron.beans.Account;
import com.synechron.beans.Customer;
import com.synechron.exceptions.CustomerException;

public class CustomerService implements ICustomer {

	@Override
	public List<Customer> addCustomer(Customer c, List<Customer> list) {
		// TODO Auto-generated method stub
		list.add(c);
		return list;
	}

	@Override
	public List<Customer> displayCustomers(List<Customer> list) {
		return list.stream().filter((obj) -> obj.getName().toLowerCase().startsWith("a")).collect(Collectors.toList());
	}

	@Override
	public double checkBalance(int accountNo, List<Account> list) {
		// TODO Auto-generated method stub
	//	return list.stream().filter(obj -> obj.getAccountNo() == accountNo).map(a -> a.getBalance()).findAny()
	//			.orElseThrow();
		 return 0;
		// list.stream().findAny(obj->obj.getAccountNo()==accountNo);
	}

	@Override
	public List<Customer> deposit(int accountNo, double amount, List<Account> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> withdraw(int accountNo, double amount, List<Account> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getEliteCustomers(List<Account> list, double amount) {
		// TODO Auto-generated method stub
		//return list.stream().filter((obj) -> obj.getBalance() > amount).collect(Collectors.toList());
		return null;
	}

	@Override
	public List<Account> createAccount(int customerId, List<Customer> list, String accType, List<Account> acList) throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> l1 = list.stream().filter((c) -> c.getCustomerId() == customerId).collect(Collectors.toList());
		if (l1.size() == 1) {
			Account a = new Account();
			a.setAccountType(accType);
			a.setCustomer(l1.get(0));
			acList.add(a);
		} else
			throw new CustomerException("Customer ID is wrong");
		return acList;
	}

}
