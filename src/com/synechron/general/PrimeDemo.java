package com.synechron.general;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Please provide input in numeric format");
		boolean flag= true;
		while (flag) {
			String s1 = s.next();
			if (s1.matches("[0-9]+")) {
				System.out.println(checkPrimeNumber(Integer.parseInt(s1)));
				flag= false;
			}
			else
				System.out.println("provide input in numeric format only");
		}
		
		System.out.println("End of program");
	}

	public static String checkPrimeNumber(int n) {
		return n + " is a Prime number";
	}

}
