package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
public static void main(String[] args) {

	
	// Configuration
	
	// Chrome - webdriver.chrome.driver
	// firefox - webdriver.gecko.driver
	// ie - webdriver.ie.driver
	// edge - webdriver.edge.driver
	// chrome
//	System.setProperty("webdriver.chrome.driver", 
//			"C:\\ProgramData\\Learning\\workspace\\febtestometerjava\\seleniumproject\\drivers\\chromedriver.exe"); 
	
	//WebDriverManager.edgedriver().setup();
	
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
//	WebDriver driver = new ChromeDriver(options);
	WebDriver driver = new EdgeDriver();  //  no cokkies - session 
	driver.manage().window().maximize();   // maximize a window
	// in differnt size
//	driver.manage().window().setSize(new Dimension(300, 600));
	
	driver.get("https://www.google.com"); // you always have to provide protocol
	
	// basic method of selenium
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
	
	driver.close(); // only close the active tab
	driver.quit(); // close the entire session
	
	
	

}
}
