package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test19 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Open Browser
        System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
	    ChromeDriver d=new ChromeDriver();
	    Thread.sleep(5000);
	    //Launch site
	    d.get("http://www.google.co.in");
	    //Locate element
	    WebElement e=d.findElement(By.linkText("Gmail"));
	    //get details of Gmail link before focus
	    String s1=e.getCssValue("opacity");
	    String s2=e.getCssValue("text-decoration");
	    System.out.println("Details of gmail link before focus:");
	    System.out.println(s1+" "+s2);
	    //get focus to Gmail link
	    Actions a=new Actions(d);
	    a.moveToElement(e).build().perform();
	    Thread.sleep(5000);
	    //get details of Gmail link after focus
	    String s3=e.getCssValue("opacity");
	    String s4=e.getCssValue("text-decoration");
	    System.out.println("Details of gmail link after focus:");
	    System.out.println(s3+" "+s4);
	    //close site
	    d.close();
	    
	    
	   	}

}
