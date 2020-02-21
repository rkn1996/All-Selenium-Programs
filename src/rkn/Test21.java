package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("http://www.gmail.com");
		Thread.sleep(5000);
		WebElement e=d.findElement(By.name("hiddenPassword"));
		if(e.isDisplayed())
		{
		   System.out.println("Element is Visible in page");
		}
		else
		{
		   System.out.println("Element is invisible in page");
		}
		//close site
		d.close();
		

	}

}
