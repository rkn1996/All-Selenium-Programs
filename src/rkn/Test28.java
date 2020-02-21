package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test28 {

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
		//count of link in a page
		List<WebElement> l=d.findElements(By.xpath("//a"));
		System.out.println("Count of link in a page is:"+l.size());
		//get o/p of visible and invisible links
		int vlc=0;
		int hlc=0;
		//using for each loop
		for(WebElement e:l)
		   {
			  if(e.isDisplayed())
				{
					vlc=vlc+1;
					//get o/p of links
					String s=e.getAttribute("href");
					System.out.println(s);
				}
				else
			    {
					hlc=hlc+1;
				}
			}
		System.out.println("Visible links are:"+vlc);
		System.out.println("Invisible links are:"+hlc);
		//close site
		d.close();

	}

}
