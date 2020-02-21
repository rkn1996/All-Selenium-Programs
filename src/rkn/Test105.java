package rkn;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Test105 
{
	public static void main(String[] args) 
	{
		//Headless Browser(HtmlUnitDriver)
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");
		String x=driver.getTitle();
		System.out.println(x);
		driver.close();

	}

}
