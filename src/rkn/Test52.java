package rkn;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test52 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.snapdeal.com");
		Thread.sleep(5000);
		//count all links of sites
		List<WebElement> l=driver.findElements(By.xpath("(//area)|(//link)|(//img)|(//base)|(//href)|(//a)"));
		System.out.println("Count of total links:"+l.size());
		int wlink=0;
		int blink=0;
		int ntlink=0;
		int nulllink=0;
		int nrlink=0;
		//get all href links
		for(WebElement e:l)
		{
			//null links
		   String x=e.getAttribute("href");
		   if(x==null)
		   {
			  nulllink++; 
		   }
		   else
		   {
			   //not testable links
			   if(x.contains("mailto:")||x.contains("javascript:")||x.contains("tel:")||x.contains("android-app:")||x.contains("ios-app"))
			   {
				   ntlink++;
			   }
			   else
			   {
				   //working and broken links
				   try
				   {
					   URL u=new URL(x);
					   HttpURLConnection con=(HttpURLConnection) u.openConnection();
					   con.connect();
					   String r=con.getResponseMessage();
					   con.disconnect();
					   if(r.equalsIgnoreCase("ok"))
					   {
						   wlink++;
					   }
					   else
					   {
						   blink++;
						   System.out.println("Broken links are:"+x);
					   }
					   
				   }
				   //not responded links
				   catch(Exception ex)
				   {
					   nrlink++;
					   System.out.println("Not responsed links are:"+x);
				   }
			   }
				   
		   }
		}
		//close site
		driver.close();
		

	}

}
