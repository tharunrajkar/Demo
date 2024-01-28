package com.interview;

import java.util.Scanner;

public class SwappingNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		
		// intialise the variable
		
		int a;
		int b;
		
		// to get the Input from the user
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		
		// Storing the value from the user
		
		a = num.nextInt();
		b = num.nextInt();
	
		//Assigning value for to swap
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Swapping numbers are: ");
		System.out.println(a);
		System.out.println(b);
		
		num.close();
	}
	

}
