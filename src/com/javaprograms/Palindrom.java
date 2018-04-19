package com.javaprograms;

public class Palindrom {

	public static void main(String[] args) {
		String str;
		String reverse="";
		str="madam";
		System.out.println(str.length());
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+str.charAt(i);
			
		}
		System.out.println(reverse);
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("string is palindrom");
		}
		else {
			System.out.println("string is not palindrom");
		}
	}

}
