package rkn;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test44 
{

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch Site
		driver.get("https://www.amazon.in");
        //collect all links of home page
		List<WebElement> l=driver.findElements(By.xpath("(//a)|(//img)|(//href)|(//area)|(//link)|(//base)"));
		System.out.println("count of all link:"+l.size());
		int blc=0;
		int wlc=0;
		int ntlc=0;
		int nrlc=0;
		int nulllinks=0;
		//Goto each link
		for(WebElement e:l)
		{
			//href attribute value is null or not
			if(e.getAttribute("href")==null)
			{
				nulllinks++;
			}
			else
			{
				String x=e.getAttribute("href");
				//check for not testable links
				if(x.contains("mail:to")||x.contains("javascript:")||x.contains("tel:")||x.contains("android-app")||x.contains("ios-app:"))
				{
					ntlc++;
				}
				else
				{
					//check for broken or correct
					try
					{
						URL u=new URL(x);
						HttpURLConnection con=(HttpURLConnection) u.openConnection();
						con.connect();
						Thread.sleep(5000);
						String r=con.getResponseMessage();
						con.disconnect();
						if(r.equalsIgnoreCase("OK"))
						{
							wlc++;
						}
						else
						{
							blc++;
							System.out.println(x);
						}
					}
					catch(Exception ex)
					{
						nrlc++;
						System.out.println(x);
					}
				}
			}
		}
		System.out.println("Count of links with href as null is"+nulllinks);
		System.out.println("Count of not testable links is"+ntlc);
		System.out.println("Count of correctly working links"+wlc);
		System.out.println("Count of broken links is"+blc);
		System.out.println("Count of not responded link is"+nrlc);
		//close site
		driver.close();
	}

}
