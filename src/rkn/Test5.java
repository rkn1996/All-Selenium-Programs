package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\TestingTools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.newtours.demoaut.com");
        d.findElement(By.linkText("REGISTER")).click();
        Thread.sleep(5000);
        d.findElement(By.name("firstName")).sendKeys("Roshan Kumar");
        Thread.sleep(5000);
        d.findElement(By.name("lastName")).sendKeys("Nayak");
        Thread.sleep(5000);
        d.findElement(By.name("phone")).sendKeys("9040211113");
        Thread.sleep(5000);
        d.findElement(By.name("userName")).sendKeys("kumarroshan@gmail.com");
        Thread.sleep(5000);
        d.findElement(By.name("address1")).sendKeys("Kondapur");
        Thread.sleep(5000);
        d.findElement(By.name("address2")).sendKeys("Kothagoda x roads");
        Thread.sleep(5000);
        d.findElement(By.name("city")).sendKeys("Hyderabad");
        Thread.sleep(5000);
        d.findElement(By.name("state")).sendKeys("Talengana");
        Thread.sleep(5000);
        d.findElement(By.name("postalCode")).sendKeys("500084");
        Thread.sleep(5000);
        d.findElement(By.name("email")).sendKeys("kumsr232");
        Thread.sleep(5000);
        d.findElement(By.name("password")).sendKeys("roshan@231");
        Thread.sleep(5000);
        d.findElement(By.name("confirmPassword")).sendKeys("roshan@231");
        Thread.sleep(5000);
        d.findElement(By.name("register")).click();
        d.close();

	}

}
