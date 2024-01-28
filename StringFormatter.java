package com.interview;

public class StringFormatter {
	public static void reverseString(String str){
		String s="James";
		char ch[]=s.toCharArray();
		String reverse="";
		for (int i=ch.length-1;i>=0; i--){
		reverse=reverse+ch[i];
		}
		System.out.println(reverse);
		
	}
	

}
