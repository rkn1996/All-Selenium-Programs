package rkn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.youtube.com");
		d.manage().window().maximize();
		d.close();
	}

}
