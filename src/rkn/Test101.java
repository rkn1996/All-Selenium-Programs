package rkn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test101 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//open 1-site
		driver.get("https://www.google.co.in");
		String x=driver.getWindowHandle();
		Thread.sleep(5000);
		//open 2-site 
		WebDriver tab1=driver.switchTo().newWindow(WindowType.TAB);
		tab1.get("https://www.gmail.com");
		String y=tab1.getWindowHandle();
		Thread.sleep(5000);
		WebDriver win1=driver.switchTo().newWindow(WindowType.WINDOW);
		win1.get("https://seleniumhq.org");
		String z=win1.getWindowHandle();
		driver.switchTo().window(x);
		Thread.sleep(5000);
		driver.switchTo().window(z);

	}

}
