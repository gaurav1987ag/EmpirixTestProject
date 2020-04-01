package TestCore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CoreFile {

		public static WebDriver driver;
		@Parameters("browser")
		@BeforeTest
		public static void Init(@Optional String browser) throws IOException, InterruptedException {
			
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
				Reporter.log("Set the property for Chrome Driver.");
				
			    driver = new ChromeDriver();
				System.out.println("Create the instance for Chrome Driver.");
				Reporter.log("Create the instance for Chrome Driver.");
				
				driver.get("https://services.empirix.com/");
				System.out.println("Launch the URL on Chrome Browser.");
				Reporter.log("Launch the URL on Chrome Browser.");
				Thread.sleep(3000);
				driver.get(driver.getCurrentUrl());
				
				driver.manage().window().maximize();
				Reporter.log("Maximize the Chrome Window.");
				System.out.println("Maximize the Chrome Window.");
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver","Drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				System.out.println("Launch the URL on IE Browser.");
				Reporter.log("Launch the URL on IE Browser.");
				driver.navigate().to("https://services.empirix.com/");
			}
		}
		/*@AfterSuite
		public static void CloseTestSuite() throws Exception {
			System.out.println("Close the Driver.");
			Reporter.log("Close the Driver.");
			driver.close(); 
			driver.quit();
		}*/
}
