package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test8 {

	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver","E://Testingtools//chromedriver.exe");
	   ChromeDriver d=new ChromeDriver();
	   d.get("http://newtours.demoaut.com/");
	   d.manage().window().maximize();
	   Thread.sleep(1000);
       d.findElement(By.linkText("REGISTER")).click();
       Thread.sleep(1000);
       d.findElement(By.name("firstName")).sendKeys("Roshan");
       Thread.sleep(1000);
       d.findElement(By.name("lastName")).sendKeys("Kumar Nayak");
       Thread.sleep(1000);
       d.findElement(By.name("phone")).sendKeys("9040244537");
       Thread.sleep(1000);
       d.findElement(By.name("userName")).sendKeys("rknroan23@gmail.com");
       Thread.sleep(1000);
       d.findElement(By.name("address1")).sendKeys("Kothagoda");
       Thread.sleep(1000);
       d.findElement(By.name("address2")).sendKeys("back side of Masjed");
       Thread.sleep(1000);
       d.findElement(By.name("city")).sendKeys("Hyderabad");
       Thread.sleep(1000);
       d.findElement(By.name("state")).sendKeys("Talengana");
       Thread.sleep(1000);
       d.findElement(By.name("postalCode")).sendKeys("800054");
       Thread.sleep(1000);
       WebElement e=d.findElement(By.name("country"));
       Select s=new Select(e);
       s.selectByVisibleText("INDIA");
       Thread.sleep(1000);
       d.findElement(By.name("email")).sendKeys("rkn322");
       Thread.sleep(1000);
       d.findElement(By.name("password")).sendKeys("rkn322@34");
       Thread.sleep(1000);
       d.findElement(By.name("confirmPassword")).sendKeys("rkn322@34");
       Thread.sleep(1000);
       d.findElement(By.name("register")).click();
       Thread.sleep(1000);
       d.close();
	}

}
