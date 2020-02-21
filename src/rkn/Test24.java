package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		d.get("https://www.gmail.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//fill login fields
		d.findElement(By.name("identifier")).sendKeys("kumarnayakroshan305@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("babyiloveu@1234#");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//select all mail in table
		for(int i=1;i<=50;i++)
		{
		  Thread.sleep(2000);
		  WebElement e=d.findElement(By.xpath("(//table)[7]/tbody/tr["+i+"]/td[2]/div[@role='checkbox']"));
		  e.click();
		}

	}

}
