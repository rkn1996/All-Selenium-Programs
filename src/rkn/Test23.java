package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.cleartrip.com");
		Thread.sleep(5000);
		//locate element
		WebElement e=d.findElement(By.xpath("(//*[@name='trip_type'])[2]"));
		if(e.isDisplayed())
		{
			System.out.println("Element is visible");
			if(e.isEnabled())
			{
				System.out.println("Visible element is enabled");
				if(e.isSelected())
				{
					System.out.println("Enabled element is selected");
				}
				else
				{
					System.out.println("Enabled element is not selected");
				}
			}
			else
			{
				System.out.println("Visible element is disabled");
			}
		}
		else
		{
			System.out.println("Element is invisible");
		}
		//close site
		d.close();
	}

}
