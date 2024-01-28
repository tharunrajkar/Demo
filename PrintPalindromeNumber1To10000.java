package com.interview;

public final class PrintPalindromeNumber1To10000 {

	public static void main(String[] args) {
		
		for (long n = 1; n <= 10000.0; n++) {
			
			long a=0;
			long i=0;
			long j=0;
			
			a=n;
			
			while (a>0) {
				i = a%10;
				j = (j*10)+i;
				a = a/10;
				
			}
			if (n==j) {
				System.out.println(n);
				
			}
			
		}

	}

}
