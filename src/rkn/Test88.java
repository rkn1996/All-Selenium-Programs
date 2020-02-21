package rkn;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test88 
{
	public static void main(String[] args) 
	{
		//Take input from keyboard
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Browser name:");
        String x=sc.nextLine();
        //Cross Browser
        WebDriver driver=null;
        if(x.equalsIgnoreCase("Chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
        	System.setProperty("webdriver.chrome.silentOutput","true");
        	driver=new ChromeDriver();
        }
        else if(x.equalsIgnoreCase("firefox"))
        {
        	System.setProperty("webdriver.gecko.driver","E:\\Testingtools\\geckodriver.exe");
        	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"E:\\sample.txt");
        	driver=new FirefoxDriver();
        }
        else if(x.equalsIgnoreCase("opera"))
        {
        	System.setProperty("webdriver.opera.driver","E:\\Testingtools\\operadriver_win64\\operadriver.exe");
        	OperaOptions oo=new OperaOptions();
        	oo.setBinary("C:\\Users\\USER\\AppData\\Local\\Programs\\Opera\\launcher.exe");
        	driver=new OperaDriver(oo);
        }
        else if(x.equalsIgnoreCase("edge"))
        {
        	System.setProperty("webdriver.edge.driver","E:\\Testingtools\\msedgedriver.exe");
        	EdgeOptions oo=new EdgeOptions();
        	oo.setBinary("C:\\Program Files (x86)\\microsoft\\Edge Beta\\Application\\msedge.exe");
        	driver=new EdgeDriver(oo);
        }
        else
        {
        	System.setProperty("webdriver.ie.driver","E:\\Testingtools\\iedriverserver.exe");
        	driver=new InternetExplorerDriver();
        }
        
        
	}

}
