package com.interview;

public class ReverseString {
	public static void main(String[] args) { 

		String str = "Saranraj";
		String nstr = "";
		char ch;

		System.out.println("Original word: Saranraj");
		//System.out.println(""); 

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); 
			nstr = ch + nstr;//   nstr +=ch-->also can be used 
			//System.out.println(nstr);
		}
		System.out.println("Reversed word: " + nstr);

	}
}
