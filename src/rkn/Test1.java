package rkn;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
      ChromeDriver d=new ChromeDriver();
      d.get("http://www.google.com");
      d.close();
    		 
	}

}
