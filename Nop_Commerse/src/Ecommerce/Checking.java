package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("admin@yourstore.com");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).clear();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("admin");
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		

	}

}
