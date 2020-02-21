package rkn;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test62 
{

	public static void main(String[] args) throws Exception
	{
		//open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//open site
		driver.get("https://www.goindigo.in");
		//collect all links
		List<WebElement> l=driver.findElements(By.xpath("(//href)|(//area)|(//base)|(//a)|(//link)|(//img)"));
		System.out.println("Count of all links are:"+l.size());
		int wlc=0;
		int blc=0;
		int ntlc=0;
		int nrlc=0;
		int nulllc=0;
		for(WebElement e:l)
		{
			//null links
			if(e.getAttribute("href")==null)
			{
				nulllc++;
			}
			else
			{
				//not testable links
				String x=e.getAttribute("href");
				if(x.contains("javascript:") || x.contains("mailto:") || x.contains("tel:") || x.contains("Android-app:") || x.contains("ios-app:"))
				{
					ntlc++;
				}
				else
				{
					try
					{
						//get broken and working links
						URL u=new URL(x);
						HttpURLConnection con=(HttpURLConnection) u.openConnection();
						con.connect();
						String r=con.getResponseMessage();
						con.disconnect();
						if(r.equalsIgnoreCase("ok"))
						{
							wlc++;
						}
						else
						{
							blc++;
							System.out.println("Broken links are:"+x);
						}
					}
					catch(Exception Ex)
					{
						//not responded links
						nrlc++;
					}
				}
			}
		}
		System.out.println("Count of Working links are:"+wlc);
		System.out.println("Count of Broken links are:"+blc);
		System.out.println("Count of Not Testable links are:"+ntlc);
		System.out.println("Count of Not Responsed links are:"+nrlc);
		System.out.println("Count of Null links are:"+nulllc);
		//close site
		driver.close();

	}

}
