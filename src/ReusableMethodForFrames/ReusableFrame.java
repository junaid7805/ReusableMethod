package ReusableMethodForFrames;

import org.openqa.selenium.WebDriver;

public class ReusableFrame 
{
	 
	public String childframe(WebDriver driver , String frame)
	{
		try {
			
			driver.switchTo().frame(frame);
			
		} catch (Exception e) {
			 
		}
		return frame;
	}
	
	public String parentframe(WebDriver driver)
	{
		try {
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			 
		}
		
		return null;
	}

}
