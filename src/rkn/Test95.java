package rkn;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test95 
{
	public static void main(String[] args) throws Exception
	{
		//Type Browser Name
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser Name:");
		String s=sc.nextLine();
		WebDriver driver=null;
		//cross Browser
		if(s.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(s.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Testingtools\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(s.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","E:\\Testingtools\\msedgedriver.exe");
			EdgeOptions eo=new EdgeOptions();
			eo.setBinary("C:\\Program Files (x86)\\microsoft\\Edge Beta\\Application\\msedge.exe");
			driver=new EdgeDriver(eo);
	        
		}
		else if(s.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver","E:\\Testingtools\\operadriver_win64\\operadriver.exe");
			OperaOptions oo=new OperaOptions();
			oo.setBinary("C:\\Users\\USER\\AppData\\Local\\Programs\\Opera\\launcher.exe");
			driver=new OperaDriver(oo);
		}
		else if(s.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","E:\\Testingtools\\iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Browser Not Available");
		}
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
		//open 3-site
		WebDriver tab2=driver.switchTo().newWindow(WindowType.TAB);
		tab2.get("https://www.facebook.com");
		String z=tab2.getWindowHandle();
		Thread.sleep(5000);
		//switch to 1st window
		driver.switchTo().window(x);
		driver.findElement(By.name("q")).sendKeys("Roshan");
		Thread.sleep(5000);
		//switch to 3rd window
		driver.switchTo().window(z);
		driver.findElement(By.name("email")).sendKeys("Kumar");
		Thread.sleep(5000);
		//switch to 2nd window
		driver.switchTo().window(y);
		driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[2]")).click();
		Thread.sleep(5000);
		//close all tabs
		driver.quit();
        
	}

}
