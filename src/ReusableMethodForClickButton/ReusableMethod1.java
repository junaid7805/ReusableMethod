package ReusableMethodForClickButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethod1 
{
	
	public static WebElement byId(WebDriver driver, String id)
	{
		WebElement a=null;
		try
	{
		 a=driver.findElement(By.id(id)); 	 
		
	} catch (Exception e) {
		 
	}
		return a ;
	}
	
	public static WebElement byName(WebDriver driver, String name)
	{
		WebElement b=null;
		try {
			b=driver.findElement(By.name(name));
			
		} catch (Exception e) {
			 
		}		 
		return b;
		
	}
	public static WebElement byLinkText(WebDriver driver, String linkText)
	{
		WebElement c=null;
		try {
			c=driver.findElement(By.linkText(linkText)); 
		} catch (Exception e) {
			 
		}
		return c;
		
	}
	public static void clickButton(WebElement ele)
	{
		try {
			
		} catch (Exception e) {
			 
		}
		ele.click();
		
	}


	 

}
