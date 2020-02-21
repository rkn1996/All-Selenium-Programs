package rkn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test84 {

	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//launch browser
		driver.get("https://www.goindigo.in");
		//click on round trip
		driver.findElement(By.xpath("//label[@for='roundTrip']")).click();
		//get color property of selected radio button
		String y=(String) driver.executeScript("var x=window.getComputedStyle(document.querySelector('label[for=roundTrip]'),'::before').getPropertyValue('border-color');return(x);");
		System.out.println(y);
		//radio button is selected or not
		if(y==null)		
		{
			System.out.println("Radio button is not selected");
		}
		else
		{
			System.out.println("Radio button is selected");
		}
		//close site
		driver.close();
	}

}
