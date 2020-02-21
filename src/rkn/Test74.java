package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test74 
{
     public static void main(String[] args) throws Exception
	{
		 //open browser
    	 System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
    	 ChromeDriver driver=new ChromeDriver();
    	 Thread.sleep(5000);
    	 driver.manage().window().maximize();
    	 //launch site
    	 driver.get("https://www.yatra.com");
    	 //go on sign-up 
    	 WebElement e=driver.findElement(By.linkText("My Account"));
    	 Actions a=new Actions(driver);
    	 a.moveToElement(e).perform();
    	 Thread.sleep(5000);
    	 //click on sign-up
    	 driver.findElement(By.xpath("//ul[@class='userBlock']/li[2]/a[2]")).click();
    	 Thread.sleep(5000);
    	 driver.findElement(By.xpath("//input[@name='login-input']")).sendKeys("kumarnayakroshan305@gmail.com");
         Thread.sleep(5000);
         driver.findElement(By.xpath("(//button[text()='Continue'])[1]")).click();
         Thread.sleep(5000);
         //fill all fields
         driver.findElement(By.xpath("(//input[@data-regtype='phoneno'])[3]")).sendKeys("8249211259");
         Thread.sleep(5000);
         driver.findElement(By.xpath("(//*[@type='password'])[2]")).sendKeys("roshan@123");
         Thread.sleep(5000);
         WebElement e1=driver.findElement(By.xpath("//div[@class='title-field-container']/select"));
         e1.click();
         Select s=new Select(e1);
         List<WebElement> l=s.getOptions();
         l.get(1).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Roshan Kumar");
         Thread.sleep(5000);
         driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Nayak");
         Thread.sleep(5000);
         driver.findElement(By.xpath("//ul[@class='unstyled']/li[1]/label")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[text()='Create Account']")).click();
         //close site
         driver.close();
	}

}
