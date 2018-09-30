package ReusableMethodForClickButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFieldClickButton {

	public static void main(String[] args) 
	{
		 
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		WebElement userId=ReusableMethod1.byId(driver, "username");
		userId.sendKeys("admin");
		
		WebElement password=ReusableMethod1.byName(driver, "pwd");
		password.sendKeys("manager");
		 
		WebElement keeplogin=ReusableMethod1.byId(driver, "keepLoggedInCheckBox");
	    ReusableMethod1.clickButton(keeplogin);
		 
		WebElement login= ReusableMethod1.byLinkText(driver, "Login");
		ReusableMethod1.clickButton(login);
		 

	}

}
