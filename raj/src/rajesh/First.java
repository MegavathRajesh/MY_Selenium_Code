package rajesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\LENOVO\\Desktop\\selenium software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("‪C:\\Users\\LENOVO\\Desktop\\selenium software\\chrome-win64\\chrome-win64\\chrome.exe");
		
	 
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
	}

}
