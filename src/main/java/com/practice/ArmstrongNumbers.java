package com.practice;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int number = 1534;
		//pringArmstrongNumbers(number);
		pringAllArmstrongNumbers(number);

	}
	
	public static void pringArmstrongNumbers(int number)
	{
		int original = number;
		long calculated = 0;
		while (number>0)
		{
			
			int reminder = number%10;
			number = number/10;
			calculated = calculated+(reminder*reminder*reminder);
		}
		if(original==calculated)
		{
			System.out.println(original+" is an Armstrong number");
		}
		else
		{
			System.out.println(original+" is not an Armstrong number");
		}
	}
	
	public static void pringAllArmstrongNumbers(int number)
	{
		int original = number;
		long calculated=0;
		for (int i=1; i<=original; i++)
		{
			while (i>0)
		{
			
			int reminder = i%10;
			i = i/10;
			calculated = calculated+(reminder*reminder*reminder);
		}
		if(i==calculated)
		{
			System.out.println(i+" is an Armstrong number");
		}
		}
	}
	
	
		

}
