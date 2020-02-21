package rkn;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Test72 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//open site
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Kondapur, Hyderabad");
		Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Mangalore");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='rb-monthTable first last'])[2]/tbody/tr[1]/td[3]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='rb-monthTable first last'])[2]/tbody/tr[5]/td[5]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Return Date']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='rb-monthTable first last'])[2]/tbody/tr[7]/td[6]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Search Buses']")).click();
        Thread.sleep(5000);
        WebElement e=driver.findElement(By.xpath("(//*[text()='View Seats'])[1]"));
        Actions a=new Actions(driver);
        a.moveToElement(e).perform();
        driver.findElement(By.xpath("(//*[text()='View Seats'])[1]/following-sibling::*/ul/li[2]/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='IMPORTANT TIP']/div/i")).click();
        Thread.sleep(5000);
        WebElement e1=driver.findElement(By.xpath("//*[@class='bus-image-new']"));
        Thread.sleep(5000);
        File src=e1.getScreenshotAs(OutputType.FILE);
        File dest=new File("Busimg.png");
        FileHandler.copy(src,dest);
        Thread.sleep(5000);
        //close site
        driver.close();
        
	}

}
