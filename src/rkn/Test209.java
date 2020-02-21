package rkn;

import java.util.Scanner;

public class Test209 
{
	public static void main(String[] args) 
	{
		//prime no
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a limit");
		int limit=sc.nextInt();
		for(int i=1;i<=limit;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
			   if(i%j==0)
			   {
				  flag=1;
				  break;
			   }
		    }
		    if(flag==0)
		    {
			   System.out.print(i+" ");
		    }
		}		
	}
}
