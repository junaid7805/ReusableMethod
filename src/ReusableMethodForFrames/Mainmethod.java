package ReusableMethodForFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/JUBER/Desktop/Frame15.html");
		
		/* int size = driver.findElements(By.tagName("iframe")).size();
		 System.out.println(size); */
		ReusableFrame r=new ReusableFrame();
		 
		 driver.findElement(By.id("t1")).sendKeys("junaid");
		 r.childframe(driver, "f1"); 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		
		 r.parentframe(driver);
		driver.findElement(By.id("t1")).clear();
		 r.childframe(driver, "f2");
		driver.findElement(By.id("t2")).sendKeys("vodafone");
		
		Thread.sleep(2000);
		r.parentframe(driver);
		driver.findElement(By.id("t1")).sendKeys("ajit");
		
		r.childframe(driver, "f1");
		driver.findElement(By.xpath("//input[@name='gender'][1]")).click();
		

	}

}
