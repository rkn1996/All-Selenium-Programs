package rkn;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","E:\\Testingtools\\iedriverserver.exe");
		InternetExplorerDriver d=new InternetExplorerDriver(); 
		d.get("http://www.youtube.com");
		

	}

}
