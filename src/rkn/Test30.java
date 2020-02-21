package rkn;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30 
{

	public static void main(String[] args) 
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.facebook.com");
		//count all text-boxes
		List<WebElement> l1=d.findElements(By.xpath("//input[@type='text']"));
		List<WebElement> l2=new ArrayList<WebElement>();
		for(WebElement e:l1)
		{
			if(e.isDisplayed())
			{
				l2.add(e);
			}
		}
		l2.get(0).sendKeys("Roshan");
		//d.close();
	}

}
