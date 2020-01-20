package com.ibaseit.exception;

public class Try {
	static int i = 78;
	 static int j = i / 0;

	public static void main(String[] args) 
	{
		
		mrthod();
	}

	public static void mrthod() 
	{
		System.out.println(i);
try
{
		System.out.println(j);

	}
catch(ArithmeticException e)
{
	System.out.println("exception handled");
}
}
}
