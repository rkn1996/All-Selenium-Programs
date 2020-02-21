package rkn;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test18 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Thread.sleep(5000);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//Launch site
		d.get("http://www.amazon.in");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[text()='Hello. Sign in']")).click();
		Thread.sleep(5000);
		//click on sign in
		d.findElement(By.xpath("(//*[text()='Sign in'])[2]")).click();
		Thread.sleep(5000);
		//fell login details
		d.findElement(By.xpath("//*[@name='email']")).sendKeys("9040244437");
		Thread.sleep(5000);
		d.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("iloveu@123#");
		Thread.sleep(5000);
		d.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		//search what to buy
		d.findElement(By.xpath("//*[@name='field-keywords']")).sendKeys("one plush 7 pro");
		Thread.sleep(5000);
		d.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@alt='OnePlus 7 Pro (Nebula Blue, 8GB RAM, 256GB Storage)']")).click();
		//go to 2nd tab
		Set<String> win=d.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(win);
		Thread.sleep(5000);
		d.switchTo().window(al.get(1));
		//click on add to cart
		d.findElement(By.xpath("//*[@title='Add to Shopping Cart']")).click();
		Thread.sleep(5000);
		//go to cart
		d.findElement(By.xpath("//*[text()='Cart']")).click();
		Thread.sleep(5000);
		//delete that item from cart
		d.findElement(By.xpath("//*[contains(@aria-label,'Delete')]")).click();
		Thread.sleep(5000);
		//sign out
		//WebElement e=d.findElement(By.xpath("(//*[@class='nav-right'])[1]/descendant::*[12]"));
		//Actions a=new Actions(d);
	    //a.moveToElement(e).build().perform();
		d.findElement(By.xpath("//*[text()='Hello, Roshan']")).click();
		Thread.sleep(5000);
	    d.findElement(By.xpath("//*[text()='Sign Out']")).click();
	    Thread.sleep(5000);
        //close site
		d.quit();
	}

}
