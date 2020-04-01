package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestCore.CoreFile;

public class AccessClientInformationPageAttribute extends CoreFile {
	
	public static WebElement ClientLinkDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[1]/div/div/div/ul/li[1]/ul/li[3]"));
	}
	public static WebElement ClientName() {
		return driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div/div/form/div[1]/label[2]"));
	}
	public static WebElement LogOutProfile() {
		return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[1]/div/div/div/ul/li[1]/ul/li[11]/a/span[2]"));
		
	}
}
