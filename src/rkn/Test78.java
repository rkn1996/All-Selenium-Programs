package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test78 {

	public static void main(String[] args) throws Exception 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		//tool-tip 1
        WebElement e1=driver.findElement(By.linkText("SQL"));
        String s1=e1.getAttribute("title");
        System.out.println(s1);
        //tool-tip 2
        WebElement e2=driver.findElement(By.xpath("//div[contains(text(),'Top')]"));
        Actions a=new Actions(driver);
        a.moveToElement(e2).clickAndHold().build().perform();
        WebElement e3=e2.findElement(By.xpath("child::span"));
        String s2=e3.getText();
        System.out.println(s2);
        a.release().perform();
        //close site
        driver.close();
        
    }

}
