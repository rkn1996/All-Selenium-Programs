package rkn;

import org.openqa.selenium.opera.OperaDriver;

public class Test3 {

	public static void main(String[] args) 
	{
       System.setProperty("webdriver.","E:\\Testingtools\\");
       OperaDriver d=new OperaDriver();
       d.get("http://www.youtube.com");
	}

}
