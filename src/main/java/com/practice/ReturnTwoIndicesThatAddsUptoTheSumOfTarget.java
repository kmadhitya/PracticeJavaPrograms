package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReturnTwoIndicesThatAddsUptoTheSumOfTarget {

	public static void main(String[] args) {
		int[] arr = {2,3,7,6,5,4,1};
		int target = 7;
		printIndicesBySubtracting(arr, target);
		printIndicesByAdding(arr, target);
		int[] returnIndicesByAdding = returnIndicesByAdding(arr, target);
		System.out.println(returnIndicesByAdding[0]+" "+returnIndicesByAdding[1]);

	}
	
	public static void printIndicesBySubtracting(int[] arr, int target)
	{
		Map<Integer,Integer> emptyMap = new LinkedHashMap<Integer,Integer>();
		
		for (int i=0; i<=arr.length-1; i++)
		{
			int delta = target-arr[i];
			if (emptyMap.containsKey(delta))
			{
				System.out.println(i+" "+emptyMap.get(delta));
			}
			else
			{
				emptyMap.put(arr[i], i);
			}
		}
	}
	public static void printIndicesByAdding(int[] arr, int target)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]+arr[i]==target)
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}
	public static int[] returnIndicesByAdding(int[] arr, int target)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]+arr[i]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}

}
