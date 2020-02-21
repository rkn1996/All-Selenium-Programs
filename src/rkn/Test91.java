package rkn;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test91 {

	public static void main(String[] args) 
	{
		//Create an empty folder
		File ef=new File("MY downloads");
		ef.mkdir();
		//define preferences
		ChromeOptions co=new ChromeOptions();
		HashMap<String,Object> hm=new HashMap<String,Object>();
        hm.put("profile.default_content_settings.popups",0);
        hm.put("download.default_directory",ef.getAbsolutePath());
        co.setExperimentalOption("prefs",hm);
        //set path to chrome driver
        System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
        //open browser with preferences
        ChromeDriver driver=new ChromeDriver(co);
        //launch site
        driver.get("https://www.seleniumhq.org");
        driver.manage().window().maximize();
        WebDriverWait w=new WebDriverWait(driver,20);
        w.until(ExpectedConditions.elementToBeClickable(By.linkText("Download")));
        //Download File
        driver.findElement(By.linkText("Download")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.linkText("3.141.59")));
        driver.findElement(By.linkText("3.141.59")).click();
        //close site
        //driver.close();

	}

}
