package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test81 
{
     public static void main(String[] args) throws Exception 
     {
		//open browser
    	System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
       	ChromeDriver driver=new ChromeDriver();
       	Thread.sleep(5000);
       	driver.manage().window().maximize();
       	//launch site
       	driver.get("https://semantic-ui.com/modules/dropdown.html");
       	Thread.sleep(5000);
       	//get text of all items without opening drop-down
       	WebElement e=driver.findElement(By.xpath("//*[contains(text(),'Dropdowns can support ')]/following-sibling::div"));
       	//collect all items
       	List<WebElement> l=e.findElements(By.xpath("child::div[2]/div"));
       	Thread.sleep(5000);
        for(int i=0;i<l.size();i++)
        {
        	String y=(String) driver.executeScript("var x=arguments[0].textContent; return(x);",l.get(i));
        	System.out.println(y);
        }
        //close site
        driver.close();
	 }

}
