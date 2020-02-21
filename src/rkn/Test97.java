package rkn;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test97 {

	public static void main(String[] args) throws Exception
	{
		//Open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait w=new FluentWait(driver);
		w.pollingEvery(Duration.ofMillis(100));
		w.withTimeout(Duration.ofSeconds(20));
		//launch site
		driver.get("https://www.seleniumhq.org");
		//right click on download
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Download")));
		WebElement e=driver.findElement(By.linkText("Download"));
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
		//handle win-menu by the help of java robot
		Robot r=new Robot();
		for(int i=1;i<=6;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//close site
		driver.close();

	}

}
