package automat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		String key= "webdriver.chrome.drive";
		String value= "\"C:\\Users\\Vivek\\eclipse-workspace\\auto\\Resources\\chromedriver.exe\"";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("sachin");
		
		driver.close();
		
		
	}

}
