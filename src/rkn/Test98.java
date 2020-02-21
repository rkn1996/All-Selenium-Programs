package rkn;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test98 
{
	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,200);
		//launch site
		driver.get("https://gmail.com");
        w.until(ExpectedConditions.elementToBeClickable(By.name("identifier")));
        driver.findElement(By.name("identifier")).sendKeys("kumarnayakroshan305@gmail.com");
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        driver.findElement(By.name("password")).sendKeys("");
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        //click on compose
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Compose']")));
        driver.findElement(By.xpath("//*[text()='Compose']")).click();
        //fill fields
        w.until(ExpectedConditions.elementToBeClickable(By.name("to")));
        driver.findElement(By.name("to")).sendKeys("kumarnayakroshan305@gmail.com");
        driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Hellow");
        driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Hii\nRoshan kuamr nayak");
        //click on attachment icon
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Filedata']/preceding::*[2]")));
        driver.findElement(By.xpath("//*[@name='Filedata']/preceding::*[2]")).click();
        //handle win-menu by the help of java robot
        Thread.sleep(5000);
        StringSelection file=new StringSelection("E:\\songzz\\Middle song\\01-EMP~1.mp3");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        //click on send button
        w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[starts-with(@aria-label,'uploading')]")));
        driver.findElement(By.xpath("//*[text()='Send']")).click();
        //Get send message text 
        try 
        {
        	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Message sent.']")));
        	System.out.println("Message sent");
        }
        catch(Exception ex)
        {
        	System.out.println("Message not sent");
        }
        //do logout
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@aria-label,'Google Account')]  ")));
        driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]  ")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sign out'] ")));
        driver.findElement(By.xpath("//*[text()='Sign out'] ")).click();
        //close site
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Choose an account'] ")));
        driver.close();
	}

}
