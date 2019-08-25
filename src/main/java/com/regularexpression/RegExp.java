package com.regularexpression;

public class RegExp {

	public static void main(String[] args) {
		String stmt = "Amazon 	has more  than '50,000'		employees across 100 cities of the world";
		
		countOfWordsAndPrintAllWords(stmt);
		getAllNums(stmt);
		
	}
	
	public static void countOfWordsAndPrintAllWords(String stmt)
	{
		String[] split = stmt.split("\\s+");
		
		for(String allwords : split)
		{
			System.out.println(allwords);
		}
		System.out.println("Total number of words: "+split.length);
	}
	public static void getAllNums(String stmt)
	{
		String onlyNumbers = stmt.replaceAll("\\D", "");
		System.out.println("Total Employees: "+onlyNumbers);
	}

}
