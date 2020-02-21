package rkn;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test82 {

	public static void main(String[] args) throws Exception
	{
		//open browser
    	System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
       	ChromeDriver driver=new ChromeDriver();
       	Thread.sleep(5000);
       	driver.manage().window().maximize();
       	//launch site
       	driver.get("https://semantic-ui.com/modules/dropdown.html");
       	Thread.sleep(5000);
       	driver.executeScript("window.alert('site launch');");
       	Thread.sleep(5000);
       	driver.switchTo().alert().dismiss();
       	Thread.sleep(5000);
       	//close site
       	driver.close();

	}

}
