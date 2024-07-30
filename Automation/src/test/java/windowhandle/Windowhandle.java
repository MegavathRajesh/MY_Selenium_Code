package windowhandle;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Windowhandle {
	
	public static WebDriver driver;
  @Test
  public void whandle() {
	  
	driver.get("https://www.naukri.com/mnjuser/homepage");
	
	
  }
  
  @BeforeClass
  public void browserlaunch() {
	  
	   driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
  }
}
