package rkn;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		Thread.sleep(5000);
		//count of links in page 
		List <WebElement> l1=d.findElements(By.xpath("//a"));
		List <WebElement> l2=new ArrayList<WebElement>();
		for(WebElement e:l1)
		{
		  if(e.isDisplayed())
		  {
			l2.add(e);
			String s=e.getAttribute("href");
			System.out.println(s);
		  }
		}
		l2.get(9).click();
		//d.close();
	}
		
}
