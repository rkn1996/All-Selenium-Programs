package rkn;

public class Test103 
{
	public static void main(String[] args) throws Exception
	{
	   Myclass obj=new Myclass("dsff");
	   obj.launch("https://www.google.co.in");
	   String s=obj.titlevalidation("Google");
	   System.out.println(s);
	   obj.closesite();
	}

}
