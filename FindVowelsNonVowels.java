package com.interview;

public class FindVowelsNonVowels {

	public static void main(String[] args) {
		
		String a = "SaranRaj";
		int vovels = 0;
		int nonVovels = 0;
		
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (ch=='a' || ch=='A' || ch=='e' || ch=='E' 
					||ch == 'i' || ch=='I' || ch== 'o'
					|| ch == 'O' || ch == 'u' || ch =='U') {
				vovels++;
				
			}else {
				nonVovels++;
			}
		}
		System.out.println("No of vovels in this word :"+vovels);
		System.out.println("No of vovels in this word :"+nonVovels);

	}

}
