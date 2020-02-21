package rkn;

public class Test208 
{
	public static void main(String[] args) 
	{
		//star program
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print("*");
			}
			//2nd mountain
			for(int m=4;m>=i;m--)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print("*");
			}
			//3rd mountain
			for(int m=4;m>=i;m--)
			{
				System.out.print("/");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print("\\");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print("*");
			}
			//4th mountain
			for(int m=4;m>=i;m--)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
