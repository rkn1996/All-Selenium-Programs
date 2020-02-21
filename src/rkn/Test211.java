package rkn;

import java.util.Scanner;

public class Test211 
{
	public static void main(String[] args)
	{
		//palindrome no
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int copy=n;
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
        System.out.println("Reverse no. is: "+rev);
        if(copy==rev)
        {
        	System.out.println("It is a palindrome number");
        }
        else
        {
        	System.out.println("It is not a palindrome number");
        }
	}

}
