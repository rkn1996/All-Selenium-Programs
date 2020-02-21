package rkn;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test92 {

	public static void main(String[] args) 
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
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver=new ChromeDriver(co);
		}
		else if(s.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Testingtools\\geckodriver.exe");
			FirefoxOptions fo=new FirefoxOptions();
			fo.addArguments("dom.webnotifications.enabled","false");
			driver=new FirefoxDriver(fo);
		}
		else if(s.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","E:\\Testingtools\\msedgedriver.exe");
			EdgeOptions eo=new EdgeOptions();
			eo.setBinary("C:\\Program Files (x86)\\microsoft\\Edge Beta\\Application\\msedge.exe");
			eo.addArguments("--disable-notifications");
			driver=new EdgeDriver(eo);
	        
		}
		else if(s.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver","E:\\Testingtools\\operadriver_win64\\operadriver.exe");
			OperaOptions oo=new OperaOptions();
			oo.setBinary("C:\\Users\\USER\\AppData\\Local\\Programs\\Opera\\launcher.exe");
			oo.addArguments("--disable-notifications");
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
		//launch site
	    driver.get("https://www.redbus.in");
		driver.manage().window().maximize();


	}

}
