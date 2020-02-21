package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test83 {

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
       	//scroll page top to bottom
       	driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");
       	Thread.sleep(5000);
        //scroll page bottom to top
       	driver.executeScript("window.scrollTo(document.body.scrollHeight,0);");
       	Thread.sleep(5000);
       	//scroll to specific element
       	WebElement e=driver.findElement(By.xpath("//*[contains(text(),'Dropdowns can support ')]/following-sibling::div"));
        driver.executeScript("arguments[0].scrollIntoView();",e);
        Thread.sleep(5000);
        //close site
        driver.close();
	}

}
