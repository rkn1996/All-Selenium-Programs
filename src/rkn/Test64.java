package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test64 {

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
        Actions a=new Actions(driver);
        a.keyDown(Keys.CONTROL).perform();
        a.click(s.getOptions().get(0)).perform();
        a.click(s.getOptions().get(1)).perform();
        a.click(s.getOptions().get(3)).perform();
        a.keyUp(Keys.CONTROL).perform();
        Thread.sleep(5000);
        //get all options in drop-down
        String y=s.getWrappedElement().getText();
        System.out.println(y);
        //get all selected options
        List<WebElement> l=s.getAllSelectedOptions();
        for(WebElement w:l)
        {
        	System.out.println(w.getText());
        }
        //get first selected option
        String x=s.getFirstSelectedOption().getText();
        System.out.println("First selected option is:"+x);
        //deselect element
        s.deselectByIndex(0);
        Thread.sleep(5000);
        s.deselectByValue("audi");
        Thread.sleep(5000);
        s.deselectByVisibleText("Saab");
        //s.deselectAll();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        //close site
        driver.close();
        
	}

}
