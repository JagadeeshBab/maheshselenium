package com.javaprograms;

public class Parameterisation 
{
public static void main(String[] args)
{
	sample sam =new sample();
	sam.Test("selenium");
	sam.Test("java");
	sam.Test("phython");
	sam.Test("jagadeesh");
}
}
class sample
{
	public void Test(String str)
	{
		System.out.println("hi welcome to "+str);
	}
}