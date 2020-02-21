package rkn;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test45 
{

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch Site
		driver.get("https://www.google.co.in");
		//Collect all links
		List<WebElement> l=driver.findElements(By.xpath("(//link)|(//a)|(//img)|(//area)|(//base)|(//href)"));
		System.out.println("Count of all links are:"+l.size());
		int blinks=0;
		int wlinks=0;
		int nrlinks=0;
		int ntlinks=0;
		int nulllinks=0;
		//if href is null
		for(WebElement e:l)
		{
			String x=e.getAttribute("href");
			if(x==null)
			{
				nulllinks++;
			}
			else
			{
				//not testable links
				if(x.contains("javascript:")||x.contains("mailto:")||x.contains("android-app")||x.contains("ios-app")||x.contains("tel:"))
				{
					ntlinks++;
				}
				else
				{
					try
					{
						//working links
						URL u=new URL(x);
						HttpURLConnection con=(HttpURLConnection) u.openConnection();
						con.connect();
						Thread.sleep(5000);
						String r=con.getResponseMessage();
						//System.out.println(x);
						//System.out.println(r);
						con.disconnect();
						if(r.equals("OK"))
						{
							wlinks++;
						}
						else
						{
							blinks++;
							System.out.println("Broken links are:"+x);
						}
						
					}
					catch(Exception ex)
					{
						nrlinks++;
						System.out.println("Not Responded links are:"+x);
					}
				}
			}
		}
		System.out.println("Count of links href as null is:"+nulllinks);
		System.out.println("count of not testable links is:"+ntlinks);
		System.out.println("Count of not responded links is:"+nrlinks);
		System.out.println("Count of Broken links is:"+blinks);
		System.out.println("Count of Correctly Working links is:"+wlinks);
        //close site
		driver.close();
	}

}
