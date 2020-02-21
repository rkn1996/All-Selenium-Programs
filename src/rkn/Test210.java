package rkn;

import java.util.Scanner;

public class Test210 
{
	public static void main(String[] args) 
	{
		//factorial of a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int f=1;
		while(n>0)
		{
			f=f*n;
			n=n-1;			
		}
        System.out.println(f);
	}
}
