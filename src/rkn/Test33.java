package rkn;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test33 
{

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.gmail.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//fill login fields
		d.findElement(By.name("identifier")).sendKeys("kumarnayakroshan305@gmail.com");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("");
		d.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//collect all check box
		List<WebElement> l1=d.findElements(By.xpath("//div[@role='checkbox']"));
		List<WebElement> l2=new ArrayList<WebElement>();
		for(WebElement e:l1)
		{
			if(e.isDisplayed())
			{
			   l2.add(e);
			}			
		}
		l2.get(2).click();
		
     }

}
