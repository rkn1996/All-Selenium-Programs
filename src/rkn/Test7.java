package rkn;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test7
{

	public static void main(String[] args) 
	{
		System.out.println("Enter name of Browser");
		Scanner sc=new Scanner(System.in);
		String x= sc.nextLine();
        WebDriver d=null;
        if(x.equals("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
        	d= new ChromeDriver();
        	d.get("http://www.google.com");
        }
        else if(x.equals("firefox"))
        {
        	System.setProperty("webdriver.firefox.driver","E:\\Testingtools\\firefoxdriver.exe");
            d=new FirefoxDriver();
            d.get("http://www.google.com");
        }
        else if(x.equals("ie"))
        {
        	System.setProperty("webdriver.ie.driver","E:\\Testingtools\\iedriverserver.exe");
        	d= new InternetExplorerDriver();
        	d.get("http://www.google.com");
        }
        else
        {
        	System.out.println("Invild search");
        	System.exit(0);
        }
               
	}

}
