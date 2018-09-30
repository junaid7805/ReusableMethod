package ReusableMethodForWindowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	public static void main(String[] args)
	{
		
		 WebDriver driver= new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.billdesk.com/pgidsk/pgmerc/vodafone/VODAFONEDN_details.jsp");
		 String parentwindow=ReusableMethod.getParentWindow(driver);
		 System.out.println("parent window is "+parentwindow);
		 driver.findElement(By.xpath("//a[contains(text(),'click here')]")).click();
		 ReusableMethod.switchToWindow(driver, parentwindow);
		 

	}

}
