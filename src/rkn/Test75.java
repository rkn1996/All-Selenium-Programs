package rkn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test75 
{
    public static void main(String[] args) throws Exception
    {
		//open browser
   	    System.setProperty("webdriver.chrome.driver","E:\\Testingtools\\chromedriver.exe");
   	    ChromeDriver driver=new ChromeDriver();
   	    Thread.sleep(5000);
   	    driver.manage().window().maximize();
   	    //launch site
   	    driver.get("https://www.yatra.com");
   	    //go on sign-up 
   	    WebElement e=driver.findElement(By.linkText("My Account"));
   	    Actions a=new Actions(driver);
   	    a.moveToElement(e).perform();
   	    Thread.sleep(5000);
   	    //click on log-in
   	    driver.findElement(By.xpath("//ul[@class='userBlock']/li[2]/a[1]")).click();
   	    Thread.sleep(5000);
   	    driver.findElement(By.xpath("//input[@name='login-input']")).sendKeys("Kumarnayakroshan305@gmail.com");
   	    Thread.sleep(5000);
   	    driver.findElement(By.xpath("(//*[text()='Continue'])[1]")).click();
   	    Thread.sleep(5000);
   	    driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("roshan@123");
   	    Thread.sleep(5000);
   	    driver.findElement(By.xpath("//*[text()='Login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[2]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title='Round Trip']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@name='flight_origin'])[1]")).click();
        Thread.sleep(5000);
        List<WebElement> l=driver.findElements(By.xpath("//*[@for='BE_flight_origin_city']/following-sibling::*/ul/div/div/div/li/div/p[1]"));
        System.out.println("Total list are"+l.size());
        for(WebElement e1:l)
        {
        	String s=e1.getText();
        	System.out.println(s);
        }
        driver.findElement(By.xpath("//*[text()='Hyderabad ']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[@for='BE_flight_arrival_city']/input")).click();
        Thread.sleep(5000);
        WebElement e1=driver.findElement(By.xpath("(//input[@name='flight_destination'])[1]"));
        e1.sendKeys("Bbi",Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@name='flight_origin_date'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='day-container'])[2]/table/tbody/tr[1]/td[6]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='calendarComponent'])[2]/label/input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='day-container'])[2]/table/tbody/tr[3]/td[6]")).click();
        //close site
        //driver.close();
    }

}
