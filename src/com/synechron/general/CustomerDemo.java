package com.synechron.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.synechron.beans.Account;
import com.synechron.beans.Customer;
import com.synechron.exceptions.CustomerException;
import com.synechron.services.CustomerService;
import com.synechron.services.ICustomer;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		List<Customer> custList = new ArrayList<>();
		List<Account> accList= new ArrayList<>();
		ICustomer service = new CustomerService();
		while (true) {
			System.out
					.println("enter 1 to add new customer , enter 2 to display the customers whose name start with A  , enter 3 to exit the application");
			int option = s.nextInt();
			switch (option) {
			case 1:
				Customer c = new Customer();
				System.out.println("enter name");
				c.setName(s.next());
				custList=service.addCustomer(c, custList);
				break;
			case 2: System.out.println("enter customer id");
				int id= s.nextInt();
				System.out.println("enter account type");	
				String accType= s.next();
				try {
					service.createAccount(id, custList, accType, accList);
				} catch (CustomerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			case 3:
				System.out.println(service.displayCustomers(custList));
				break;
			case 4:
				System.out.println(service.getEliteCustomers(custList,1000000));
				break;
			case 5:
				System.exit(1);

			}

		}

	}

}
