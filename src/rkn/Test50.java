package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test50 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//launch site
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Try it']")).click();
		Thread.sleep(5000);
		//get text of alert box
		String x=driver.switchTo().alert().getText();
		System.out.println(x);
		Thread.sleep(5000);
		//close alert box
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		//close site
		driver.close();
		

	}

}
