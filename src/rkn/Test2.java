package rkn;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","E:\\Testingtools\\geckodriver.exe");
		FirefoxDriver d=new FirefoxDriver();
        d.get("http://gmail.com");
        d.close();
	}

}
