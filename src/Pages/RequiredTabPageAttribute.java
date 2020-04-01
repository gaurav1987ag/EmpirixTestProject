package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestCore.CoreFile;

public class RequiredTabPageAttribute extends CoreFile {
	
	public static WebElement DashboardTab() {
		return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[2]/div/ul/li[1]"));
	}
	public static WebElement AlertsTab() {
		return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[2]/div/ul/li[4]"));
	}
	public static WebElement TestsTab() {
		return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[2]/div/ul/li[5]"));
	}
	public static WebElement VariablesTab() {
		return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[2]/div/ul/li[14]"));
	}
	public static WebElement NotificationTab() {
		return driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[2]/div/ul/li[16]"));
	}
}
