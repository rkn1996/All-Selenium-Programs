package rkn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test56 
{

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Delete all cookies
		driver.manage().deleteAllCookies();
		//Launch Site
		driver.get("https://www.google.com");
		//get all cookies
		Set<Cookie> c=driver.manage().getCookies();
		List<Cookie> cl=new ArrayList<Cookie>(c);
		System.out.println("Count of cookies are:"+cl.size());
		for(Cookie C:cl)
		{
			//System.out.println(C);
			if(C.isHttpOnly())
			{
				System.out.println(C.getName()+"->It is a Http only cookie");
			}
			else if(C.isSecure())
			{
				System.out.println(C.getName()+"->It is a Secure cookie");
			}
			else if(C.getName().equalsIgnoreCase("session-id"))
			{
				System.out.println(C.getName()+"->It is a Session cookie");
			}
			else if(C.getName().equalsIgnoreCase("session-id-time"))
			{
				System.out.println(C.getName()+"->It is a Persistent cookie");
			}
			else if(C.getName().contains("google.com"))
			{
				System.out.println(C.getName()+"->It is a Super cookie");
			}
			else if(C.getName().contains("google.co.in"))
			{
				System.out.println(C.getName()+"->It is a Same-Site cookie");
			}
			else
			{
				System.out.println(C.getName()+"->It is a Other cookie");
			}
		}
		//close site
		driver.close();

	}

}
