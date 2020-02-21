package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//launch site
		d.get("https://www.facebook.com");
		Thread.sleep(5000);
		//login
		d.findElement(By.name("email")).sendKeys("roshankumar.nayak1@facebook.com");
		d.findElement(By.name("pass")).sendKeys("");
        Thread.sleep(5000);
        d.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        Thread.sleep(5000);
        //logout
        d.findElement(By.xpath("//*[text()='Account Settings']")).click();
        Thread.sleep(5000);
        d.findElement(By.xpath("(//*[@class='_54nh'])[9]")).click();

	}

}
