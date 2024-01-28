package com.interview;


public class PalindromeNumber1To100 {
	public static void main(String[] args) {
		for (int n = 0; n < 1000; n++) {
			 int a, i=0,j=0;
			 a=n;
			 
			 while (a>0) {
				 i = a%10;
				 j = (j*10)+i;
				 a = a/10;
				
			}if (n==j) {
				System.out.println(n);
				
			}
					 
			
		}
	}

}
