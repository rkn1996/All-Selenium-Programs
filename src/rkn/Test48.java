package rkn;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test48 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//launch site
		Thread.sleep(5000);
		//open google site
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		//navigate to flipkart site
		driver.navigate().to("http://www.flipkart.com");
		Thread.sleep(5000);
		//back to google site
		driver.navigate().back();
		Thread.sleep(5000);
		//forward to flipkart site
		driver.navigate().forward();
		Thread.sleep(5000);
		//refresh site
		driver.navigate().refresh();
		//close site
		driver.close();	

	}

}
