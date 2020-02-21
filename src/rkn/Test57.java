package rkn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test57 
{
    public static void main(String[] args) 
	{
		//Open Browser
    	System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
    	ChromeDriver driver=new ChromeDriver();
    	//delete all cookie
    	driver.manage().deleteAllCookies();
    	//open site
    	driver.get("https://www.google.com");
    	//count of all cookies
    	Set<Cookie> sc1=driver.manage().getCookies();
    	List<Cookie> lc1=new ArrayList<Cookie>(sc1);
    	System.out.println("Total Cookies are"+lc1.size());
    	for(Cookie c:lc1)
    	{
    		System.out.println(c.getName()+c.getValue());
    	}
    	//add cookie
    	Cookie co=new Cookie("Roshan","32675");
    	driver.manage().addCookie(co);
    	Set<Cookie> sc2=driver.manage().getCookies();
    	List<Cookie> lc2=new ArrayList<Cookie>(sc2);
    	System.out.println("Total no of Cookies are"+lc2.size());
    	for(Cookie c:lc2)
    	{
    		System.out.println(c.getName()+" "+c.getValue());
    	}
    	//delete cookie
    	driver.manage().deleteCookie(co);
    	Set<Cookie> sc3=driver.manage().getCookies();
    	List<Cookie> lc3=new ArrayList<Cookie>(sc3);
    	System.out.println("Total no of Cookies are"+lc3.size());
    	for(Cookie c:lc3)
    	{
    		System.out.println(c.getName()+" "+c.getValue());
    	}
    	//get cookie name
    	Cookie d=driver.manage().getCookieNamed("UULE");
    	System.out.println(d);
    	//delete cookie with name
    	driver.manage().deleteCookieNamed("UULE");
    	//close site
    	driver.close();
    	

	}

}
