package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		Thread.sleep(5000);
		//locate element
		d.switchTo().frame("iframeResult");
		WebElement e=d.findElement(By.name("lname"));
		if(e.isDisplayed())
		{
			System.out.println("Element is visible");
			if(e.isEnabled())
			{
				System.out.println("Visible element is enabled");
			}
			else
			{
				System.out.println("Visible element is disabled");
			}
		}
		else
		{
			System.out.println("Visible element is invisible");
			
		}
		//close site
		d.close();
		
	}

}
