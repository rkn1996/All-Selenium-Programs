package rkn;

import java.util.Scanner;

public class Test213 
{
	public static void main(String[] args) 
	{
		//febonacci series
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit");
		int limit=sc.nextInt();
		int x=0;
		int y=1;
		System.out.print(x+" "+y);
		do
		{
			int z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;			
		}while(x+y<limit);

	}

}
