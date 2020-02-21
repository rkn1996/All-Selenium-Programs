package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test63 
{
    public static void main(String[] args) throws Exception
    {
		//open Browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//open site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		//locate element
		WebElement e=driver.findElement(By.name("cars"));
		//select element
        Select s=new Select(e);
        s.selectByIndex(0);
        Thread.sleep(5000);
        s.selectByValue("audi");
        Thread.sleep(5000);
        s.selectByVisibleText("Opel");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        //close site
        driver.close();
	}

}
