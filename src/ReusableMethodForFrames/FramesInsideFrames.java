package ReusableMethodForFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesInsideFrames {

	public static void main(String[] args) {
		 
		WebDriver driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://the-internet.herokuapp.com/nested_frames");
	    driver.manage().window().maximize();
	

	    int size = driver.findElements(By.tagName("frame")).size();
	    System.out.println("Total Frames --" + size);
	  //frameset/frame[@name='frame-top']
		// prints the total number of frames 
		 driver.switchTo().frame(0); // Switching the Outer Frame    		
	    System.out.println (driver.findElement(By.xpath("//frameset/frame[@name='frame-top']")).getText());

		//Printing the text in outer frame
		/*size = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside outer frame           
                                                                                                          
	    System.out.println("Total Frames --" + size);
	    driver.switchTo().frame(0); // Switching to innerframe
	    System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
		
		//Printing the text in inner frame
		driver.switchTo().defaultContent();*/
	}

}

 