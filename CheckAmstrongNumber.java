package com.interview;

import java.util.Scanner;

public class CheckAmstrongNumber {
	public static void main(String[] args) {
		
	
	
	int n,a,i = 0, j = 0;
	Scanner userInput = new Scanner (System.in);
	
	System.out.println("Enter a number: ");
	n = userInput.nextInt();
	a = n;
	
	while(a>0) {
		i= a%10;
		j=j+(i*i*i);
		a=a/10;
	}
	if(n==j) {
		System.out.println("Its amstrong Number");
	}else {
		System.out.println("ITs not a amstrong Number");
	}
	userInput.close();
	}

}
