package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test85 
{

	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch browser
		driver.get("https://www.w3schools.com/bootstrap4/tryit.asp?filename=trybs_ref_js_dropdown_events2&stacked=h");
		Thread.sleep(5000);
		WebElement f=driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(f);
		WebElement e=driver.findElement(By.xpath("//h2[text()='Dropdown Events']/following::*[4]"));
		driver.executeScript("arguments[0].click();",e);
        String x=driver.switchTo().alert().getText();
        System.out.println(x);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        WebElement e1=e.findElement(By.xpath("following-sibling::div/a[1]"));
        e1.click();
        driver.switchTo().defaultContent();
        //close site
        driver.close();
        
	}

}
