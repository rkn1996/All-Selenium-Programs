package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test73 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//open site
		driver.get("https://www.redbus.in");
		//click on sign-up icon
		driver.findElement(By.xpath("//*[@id='signin_dd']/div/i")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Sign In/Sign Up']")).click();
		//switch to frame
		WebElement f=driver.findElement(By.className("modalIframe"));
        driver.switchTo().frame(f);
        driver.findElement(By.xpath("//*[@id='mobileNoInp']")).sendKeys("8249211259");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Generate OTP']")).click();
        
	}

}
