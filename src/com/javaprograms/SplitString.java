package com.javaprograms;

public class SplitString {

	public static void main(String[] args) {
		String str;
		
		str="one,five,two,six,nine,three.ten,eight";
		
		String[] s=str.split(",");
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			if(s[i].equalsIgnoreCase("six"))
			{
				System.out.println(s[i]);
			}
		}
		
		
	}

}
