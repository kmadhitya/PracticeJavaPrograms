package com.regularexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExCompileAndMatcher {

	public static void main(String[] args) {
		
		String email = "Adhitya.K.M_1987@cognizant.co.uk";
		String stmt = "Amazon 	has more  than '50000'		employees across 100 cities of the world";
		RegExCompileAndMatcher obj = new RegExCompileAndMatcher();
		obj.findPatternMatch(email);
		obj.printNumberOfEmployeesAndCities(stmt);

	}
	
	public void findPatternMatch(String email)
	{
		String pattern = "[A-Za-z0-9._]+@[a-z]+.[a-z]{2,3}+.[a-z]{2}";
		String pattern1 = ".+@[a-z]+.[a-z]{2,3}+.[a-z]{2}";
		Pattern compile = Pattern.compile(pattern);
		Matcher match = compile.matcher(email);
		if(match.matches())
		{
			System.out.println("Email pattern is correct");
		}
		else
		{
			System.out.println("Email pattern is wrong. Please correct it");
		}
	}
	
	public void printNumberOfEmployeesAndCities(String stmt)
	{
		String empAndCities = "\\d+";
		Pattern compile = Pattern.compile(empAndCities);
		Matcher match = compile.matcher(stmt);
		List<String> list = new ArrayList<String>();
		while (match.find())
		{
			
			String group = match.group();
			list.add(group);
		}
		System.out.println("Number of employees: "+list.get(0));
		System.out.println("Operating over "+list.get(1)+" number of cities");
		
	}

}
