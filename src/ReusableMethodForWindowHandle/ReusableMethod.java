package ReusableMethodForWindowHandle;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class ReusableMethod
{
	public static String getParentWindow(WebDriver driver)
	{
		String parent=null;
		try 
		{
			parent=driver.getWindowHandle();
			
		}
		catch (Exception e)
		{

		}
		return parent;
	}
 
public static void switchToWindow(WebDriver driver , String parentwindow)
{
	Set<String> allwindow= driver.getWindowHandles();
	int count = allwindow.size();
	System.out.println("Total count"+count);
	try {
		for(String childwindow:allwindow)
		{
			if(!parentwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
			System.out.println("child window title is"+driver.getTitle());
			Thread.sleep(2000);
		}
	} catch (Exception e)
	{
		driver.switchTo().window(parentwindow);
		
	}
		
 }

}