package basePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	 
	
	public void browser(String browser) throws IOException {
		
		 
		 prop = new Properties();
		 FileInputStream f = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Automation\\src\\test\\java\\maven.properties");
		
		 prop.load(f);
		
		
		if(prop.getProperty(browser).equals("Chrome")) {
			
			driver = new ChromeDriver();	
		}
		else if (prop.get(browser).equals("Firedox")) {
			
			driver = new FirefoxDriver();		
			}
            else if (prop.get(browser).equals("Edge")) {
			
			driver = new  EdgeDriver()	;
			
			}
		driver.manage().window().maximize();
		
	}
	
	public void launch(String Url){
		
		 driver.get(prop.getProperty(Url));
	}

}
