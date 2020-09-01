package com.practice;

public class StarPattern {

	public static void main(String[] args) {
		int n = 5;
		//System.out.println("Right Triangle: ");
		//rightTriangle(n);
		//System.out.println("Inverted Right Triangle: ");
		//invertedRightTriangle(n);
		//System.out.println("Equilateral Triangle: ");
		//equilateralTriangle(n);
		System.out.println("Inverted Equilateral Triangle: ");
		invertedEquilateralTriangle(n);
		//System.out.println("Right Triangle after 180 degree rotation: ");
		//rotateRightTriangleBy180Degree(n);
		//System.out.println("Inverted Right Triangle after 180 degree rotation: ");
		//rotateInvertedRightTriangleBy180Degree(n);

	}
	public static void rightTriangle(int n)
	{
		for (int i=0; i<=n; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void invertedRightTriangle(int n)
	{
		for (int i=n; i>=0; i--)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void equilateralTriangle(int n)
	{
		//j=n-i
		for (int i=0; i<=n; i++)
		{
			for (int j=n-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	public static void invertedEquilateralTriangle(int n)
	{
		//j=n-i
		for (int i=n; i>=0; i--)
		{
			for (int j=n-i; j>0; j--)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	
	public static void rotateRightTriangleBy180Degree(int n)
	{
		//j=2*(n-i)
		for (int i=0; i<=n; i++)
		{
			for (int j=2*(n-i); j>0; j--)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void rotateInvertedRightTriangleBy180Degree(int n)
	{
		//j=2*(n-i)
		for (int i=n; i>=0; i--)
		{
			for (int j=2*(n-i); j>0; j--)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
