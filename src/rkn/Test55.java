package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test55 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.tutorialspoint.com/online_javascript_editor.php");
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//*[text()='Preview'])[2]")).click();
		//driver.findElement(By.xpath("//input[@onclick='Warn();']")).click();

	}

}
