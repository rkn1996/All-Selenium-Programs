package rkn;

import java.util.Scanner;

public class Test212 
{
	public static void main(String[] args) 
	{
		//armstrong number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int copy=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
        System.out.println(sum);
        if(copy==sum)
        {
        	System.out.println("It is a Armstrong number");
        }
        else
        {
            System.out.println("It is not a Armstrong number");
        }
	}

}
