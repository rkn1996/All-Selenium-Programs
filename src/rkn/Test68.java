package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test68 
{
   public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//locate element
		WebElement e=driver.findElement(By.xpath("//*[@id='multiple-selection']/following-sibling::*[2]"));
		String x=e.getAttribute("class");
		if(x.contains("multiple"))
		{
			System.out.println("Multi select drop-down");
		}
		else
		{
			System.out.println("Single select drop-down");
		}
		//close site
		driver.close();

	}

}
