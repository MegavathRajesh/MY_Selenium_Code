package datadriven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	public static WebDriver driver;

	 @DataProvider(name="provider")
	  public Object[][] dataprovide() {
		  
		  Object[][] obj = {{"charan","cha123"},{"nagesh","nag123"},{"Rajesh","Raj123"}};
		  return obj;
	  }
  @Test(dataProvider ="provider")
  public void testdata(String username, String password) {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.facebook.com/");
	  
	  
	  System.out.println("User login username is = "+username+" And Password is = "+password);
	  
  }
 
    
}
