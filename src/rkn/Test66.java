package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test66 
{

	public static void main(String[] args) throws Exception 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.w3schools.com/Jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		//double click on element
		WebElement e=driver.findElement(By.xpath("//*[starts-with(text(),'Double-click')]"));
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
		Thread.sleep(5000);
		//get text of element
		String x=driver.findElement(By.xpath("//*[@id='demo']")).getText();
		System.out.println(x);
		driver.switchTo().defaultContent();
		//close site
		driver.close();

	}

}
