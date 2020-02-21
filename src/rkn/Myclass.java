package rkn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Myclass 
{
   public WebDriver driver;
   public Myclass(String browsernm) throws Exception
   {
       if(browsernm.equalsIgnoreCase("chrome"))
	   {
		  System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		  driver= new ChromeDriver();
	   }
	   else if(browsernm.equalsIgnoreCase("firefox"))
	   {
		  System.setProperty("webdriver.gecko.driver","E:\\Testingtools\\geckodriver.exe");
		  driver= new FirefoxDriver();
	   }
	   else if(browsernm.equalsIgnoreCase("edge"))
	   {
		  System.setProperty("webdriver.edge.driver","E:\\Testingtools\\msedgedriver.exe");
		  EdgeOptions eo=new EdgeOptions();
		  eo.setBinary("C:\\Program Files (x86)\\microsoft\\Edge Beta\\Application\\msedge.exe");
		  driver= new EdgeDriver(eo);
	   }
	   else if(browsernm.equalsIgnoreCase("opera"))
	   {
		  System.setProperty("webdriver.opera.driver","E:\\Testingtools\\operadriver.exe");
		  OperaOptions oo=new OperaOptions();
		  oo.setBinary("C:\\Users\\USER\\AppData\\Local\\Programs\\Opera\\launcher.exe");
		  driver= new OperaDriver(oo);
	   }
	   else
	   {
		   System.setProperty("webdriver.ie.driver","E:\\Testingtools\\iedriverserver.exe");
		   driver= new InternetExplorerDriver();
	   }
   }
   //general method
   public void launch(String url)
   {
	   driver.get(url);
   }
   public void closesite()
   {
	   driver.close();
   }
   public String titlevalidation(String ex)
   {
	   String a=driver.getTitle();
	   if(a.equals(ex))
	   {
		   return("Test Passed");
	   }
	   else
	   {
		   return("Test Failed");
	   }
   }
}
